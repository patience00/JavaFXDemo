package main.java.text;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 文字旋转
 *
 * @author: 通天晓107
 * @review:
 * @date: 2018-08-21 09:14
 * @version: 1.0
 */
public class Text1 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Text");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.WHITE);
        int x = 100;
        int y = 100;
        int red = 200;
        int green = 40;
        int blue = 50;

        Text text = new Text(x, y, "Hello world");

        // 设置字体颜色，透明度
        text.setFill(Color.rgb(red, green, blue, .9));
        text.setRotate(300); // 设置文本的旋转角度(0-360)度
        root.getChildren().add(text);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
