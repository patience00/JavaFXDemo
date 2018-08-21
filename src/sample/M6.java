package sample;

/**
 * @author 通天晓
 * @date 2018-08-20 22:38
 **/
//以下代码显示了如何创建路径(Path)。

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
// @ w  w w .Y I I b A i. CO M
public class M6 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Checkbox Sample");
        stage.setWidth(230);
        stage.setHeight(120);

        Path path = new Path();
        path.getElements().add(new MoveTo(0.0f, 50.0f));
        path.getElements().add(new LineTo(100.0f, 100.0f));

        VBox vbox = new VBox();
        vbox.getChildren().addAll(path);
        vbox.setSpacing(5);

        HBox root = new HBox();
        root.getChildren().add(vbox);
        root.setSpacing(40);
        root.setPadding(new Insets(20, 10, 10, 20));

        ((Group) scene.getRoot()).getChildren().add(root);

        stage.setScene(scene);
        stage.show();
    }
}
