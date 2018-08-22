package bar;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
/**
 * 进度条
 *
 * @author: 通天晓107
 * @review:
 * @date: 2018-08-22 18:13
 * @version: 1.0
 */
public class BarTest extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 260, 80);
        stage.setScene(scene);

        Group g = new Group();

        ProgressBar p2 = new ProgressBar();
        g.getChildren().add(p2);
        scene.setRoot(g);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}