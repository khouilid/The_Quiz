package Controllers;

import javafx.scene.control.Alert;

public class Conditions {


    public static void timeConditions(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("The Quiz");
        alert.setHeaderText("Gime over");
        alert.setContentText((msg));
        alert.show();

    }


    public static void levelConditions(int score, int level) {
        if (level == 1 & score < 40) {
            timeConditions("Gime over");
        }
        if (level == 2 && score < 60) {
            timeConditions("You lose!");
        }
        if (level == 3 ) {
            if (score < 80){
                timeConditions("You lose!");
            }else{
                timeConditions("You win!");
            }
        }
    }
}
