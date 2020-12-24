package Controllers;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;


public class UserChoice extends Questions {


    private static int questioID = 0;
    private static int levell = 1;
    private static int score = 0;

    public RadioButton userChoice_1;
    public RadioButton userChoice_2;
    public RadioButton userChoice_3;
    public ToggleGroup choisess;
    public Button btn;
    public Label question;
    public Label levels;
    public Label scor;


    public UserChoice() {
        super();


    }


    public void getUserChoice(MouseEvent mouseEvent) {
        levels.setText(Integer.toString(levell));

        dispalyQuestion();
        getAnwser();

        questioID++;
        if (questioID == 5) {
            questioID = 0;
            levell++;
        }

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
        } else {
            System.out.println("u lose");
        }
        scor.setText(Integer.toString(score));
    }


}
