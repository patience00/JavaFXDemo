package button;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * comment
 *
 * @author: 通天晓107
 * @review:
 * @date: 2018-08-21 15:58
 * @version: 1.0
 */
public class UseCSSButton extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        Scene scene = new Scene(new Group());
        stage.setWidth(300);
        stage.setHeight(190);

        // 读取css文件
        scene.getStylesheets().add(getClass().getResource("/main/java/button/button.css").toExternalForm());
        VBox vbox = new VBox();
        vbox.setLayoutX(20);
        vbox.setLayoutY(20);

        Button button1 = new Button("Accept");
//        button1.setStyle("-fx-font: 30 arial; -fx-base: #ee2211;");
        button1.getStyleClass().add("button1");

        vbox.getChildren().add(button1);
        vbox.setSpacing(10);
        ((Group)scene.getRoot()).getChildren().add(vbox);

        stage.setScene(scene);
        stage.show();
    }
}