package Controllers;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

public class Conditions {


    public static void timeConditions(String msg, Stage stage) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("The Public.Quiz");
        alert.setHeaderText("Gime over");
        alert.setContentText((msg));
        Optional<ButtonType> result = alert.showAndWait();
        if(result.isEmpty() || result.get() == ButtonType.OK) {
            System.out.println("its work ");
            stage.close();
        }


    }


    public static void levelConditions(int score, int level, Stage stage) {
        if (level == 1 & score < 40) {
            timeConditions("Gime over" , stage);
        }
        if (level == 2 && score < 60) {
            timeConditions("You lose!", stage);
        }
        if (level == 3 ) {
            if (score < 80){
                timeConditions("You lose!", stage);
            }else{
                timeConditions("You win!", stage);
            }
        }
    }
}
