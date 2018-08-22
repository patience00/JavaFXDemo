package main.java.sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
/**
 * @author 通天晓
 * @date 2018-08-20 23:03
 * 半透明渐变
 **/
public class M11 extends Application {
    // from W w w . y i I b a I. C o M
    @Override
    public void start(Stage stage) {
        VBox box = new VBox();
        final Scene scene = new Scene(box,300, 250);
        scene.setFill(null);
        // A rectangle filled with a linear gradient with a translucent color.
        Rectangle rectangle = new Rectangle();
        rectangle.setX(50);
        rectangle.setY(50);
        rectangle.setWidth(100);
        rectangle.setHeight(70);

        LinearGradient linearGrad = new LinearGradient(
                0,   // start X
                0,   // start Y
                0,   // end X
                1, // end Y
                true, // proportional
                CycleMethod.NO_CYCLE, // cycle colors
                // stops
                new Stop(0.1f, Color.rgb(25, 200, 0, .4)),
                new Stop(1.0f, Color.rgb(0, 0, 0, .1)));
        rectangle.setFill(linearGrad);

        box.getChildren().add(rectangle);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
