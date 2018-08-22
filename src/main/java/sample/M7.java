package main.java.sample;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.stage.Stage;
/**
 * @author 通天晓
 * @date 2018-08-20 22:39
 **/
// Path元素实际上从javafx.scene.shape.PathElement类扩展，它仅在Path对象的上下文中使用。
//
//所以不能实例化一个LineTo类放在场景图中。使用To作为后缀的类是Path元素，而不是Shape节点。
//
//例如，MoveTo和LineTo对象实例可添加到Path对象的Path元素中，而不可以添加到场景的形状。
public class M7 extends Application {
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);
        stage.setTitle("");

        Path path = new Path();

        MoveTo moveTo = new MoveTo();
        moveTo.setX(0.0f);
        moveTo.setY(50.0f);

        QuadCurveTo quadTo = new QuadCurveTo();
        quadTo.setControlX(25.0f);
        quadTo.setControlY(0.0f);
        quadTo.setX(50.0f);
        quadTo.setY(50.0f);

        path.getElements().add(moveTo);
        path.getElements().add(quadTo);

        root.getChildren().add(path);

        scene.setRoot(root);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
