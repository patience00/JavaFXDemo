package main.java.button;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 当用户单击按钮时，JavaFX Button类可以触发事件。Button类扩展了Labeled类，可以显示文本，图像或两者都可以。
 以下代码显示了如何向Button添加单击操作侦听器
 *
 * @author: 通天晓107
 * @review:
 * @date: 2018-08-21 15:02
 * @version: 1.0
 */
public class Button1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        DropShadow shadow = new DropShadow();
        btn.setEffect(shadow); // 设置阴影
        btn.setEffect(null);//remove the effect
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}