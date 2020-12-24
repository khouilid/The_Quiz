import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz extends Application {
    @Override
    public void start(Stage stage) throws Exception {


        stage.setTitle("The Quiz");
        stage.setWidth(700);
        stage.setHeight(700);


        VBox header = new VBox();
        header.setId("windows");

        VBox header2 = new VBox();
        header2.setId("windows2");

        Label title = new Label("The Quiz");
        title.setId("title");
        title.setTextFill(Color.WHITE);
        title.setFont(new Font("Roboto",26));

        header2.getChildren().addAll(title);
        header.getChildren().addAll(header2);

        Scene scene = new Scene(header);
        scene.getStylesheets().add("Stylesheet/Main.css");







        stage.setScene(scene);
        stage.show();

    }
}
