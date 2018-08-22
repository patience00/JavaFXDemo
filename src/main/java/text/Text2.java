package text;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * comment
 *TextField用于单行文本输入。请看下面的示例 -
 * @author: 通天晓107
 * @review:
 * @date: 2018-08-22 16:54
 * @version: 1.0
 */
public class Text2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group(), 450, 250);

        TextField notification = new TextField ();
        notification.setText("Label");

        notification.clear();

        GridPane grid = new GridPane();
        grid.setVgap(4);
        grid.setHgap(10);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.add(new Label("To: "), 0, 0);
        grid.add(notification, 1, 0);

        Group root = (Group) scene.getRoot();
        root.getChildren().add(grid);
        stage.setScene(scene);
        stage.show();
    }
}