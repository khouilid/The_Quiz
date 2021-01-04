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


    public static void levelConditions(int score, int level){

        if(level == 1 && score <= 20){

        }

    }
}
