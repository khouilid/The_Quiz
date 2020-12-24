import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Quiz extends Application {
    @Override
    public void start(Stage stage) throws Exception {


//        stage.setTitle("The Quiz");
//        stage.setWidth(700);
//        stage.setHeight(700);
//
//
//        VBox header = new VBox();
//        header.setId("windows");
//        header.getStylesheets().add("Stylesheet/Main.css");
//
//        Label title = new Label("The Quiz");
//
//
//        Text title2 = new Text("Level: " );
//
//        title2.setId("title");
//        header.getChildren().addAll(title, title2);
//
//        Scene scene = new Scene(header);
//        scene.getStylesheets().add("Stylesheet/Main.css");
//
//
//
//
//
//
//
//        stage.setScene(scene);
        Parent root = FXMLLoader.load(getClass().getResource("Public/Quiz.fxml"));

        stage.setScene(new Scene(root));

        stage.show();

    }
}
