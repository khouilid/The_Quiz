package Controllers;

import javafx.scene.control.Alert;

public class Conditions {


    public static void timeConditions() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("The Quiz");
        alert.setHeaderText("Gime over");
        alert.setContentText(("You lose!"));
        alert.show();

    }

    private static void winMsg(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("The Quiz");
        alert.setHeaderText("Gime over");
        alert.setContentText(("You win!"));
        alert.show();
    }

    public static void levelConditions(int score, int level) {
        if (level == 1 & score < 40) {
            timeConditions();
        }
        if (level == 2 && score < 60) {
            timeConditions();
        }
        if (level == 3 ) {
            if (score < 80){
                timeConditions();
            }else{
                winMsg();
            }
        }
    }
}
