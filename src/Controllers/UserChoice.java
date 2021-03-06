package Controllers;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class UserChoice extends Questions {
    private static int min = 4;
    private static int sc = 59;
    private static int questioID = 0;
    private static int levell = 1;
    private static int score = 0;

    private final Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), this::handle));


    public RadioButton userChoice_1;
    public RadioButton userChoice_2;
    public RadioButton userChoice_3;
    public ToggleGroup choisess;
    public Button btn;
    public Label question;
    public Label levels;
    public Label scor;
    public Label scends;
    public Label minutes;
    private static Stage stage;

    public static void closeit(Stage stage){
        UserChoice.stage = stage ;
    }

    public UserChoice() {
        super();
    }

    public void getUserChoice(MouseEvent mouseEvent) {

        times();
        levels.setText(Integer.toString(levell));
        dispalyQuestion();
        getAnwser();


        questioID++;
        if (questioID == 5) {
            Conditions.levelConditions(score, levell , this.stage);
            System.out.println(score + ":" + levell);
            questioID = 0;
            levell++;
        }
    }
    public void times() {
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }

    private void dispalyQuestion() {
        question.setText(getQuestions(questioID).get("question"));
        userChoice_1.setText(getQuestions(questioID).get("option_1"));
        userChoice_3.setText(getQuestions(questioID).get("option_3"));
        userChoice_2.setText(getQuestions(questioID).get("option_2"));
        btn.setText("Next");
    }

    private void getAnwser() {
        RadioButton reponse = (RadioButton) choisess.getSelectedToggle();
        String reponseText = reponse.getText();

        if (checkAnwser(reponseText, questioID)) {
            score += 20;
        }
        scor.setText(Integer.toString(score));
    }

    private void handle(ActionEvent ev) {
        if (sc == 0) {
            if (min == 0) {
                Conditions.timeConditions("You lose!", stage);
                this.timeline.stop();
            } else {
                min--;
                sc = 59;
            }
        } else {
            sc--;
        }
        scends.setText(String.valueOf(sc));
        minutes.setText(String.valueOf(min));
    }
}
