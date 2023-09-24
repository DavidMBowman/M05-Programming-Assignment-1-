import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Assignment14_1 extends Application {
    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();

        pane.add(new ImageView(new Image("images/uk.gif")), 0, 0);
        pane.add(new ImageView(new Image("images/ca.gif")), 1, 0);
        pane.add(new ImageView(new Image("images/china.gif")), 0, 1);
        pane.add(new ImageView(new Image("images/us.gif")), 1, 1);

        Scene scene = new Scene(pane);

        primaryStage.setTitle("Exercise_14_01");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}