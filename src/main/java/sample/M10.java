package main.java.sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 * @author 通天晓
 * @date 2018-08-20 23:00
 * 径向渐变
 **/
public class M10  extends Application {
    static int dx = 1;
    static int dy = 1;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("Animation");
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300, Color.WHITE);

        primaryStage.setScene(scene);
        addBouncyBall(scene);
        primaryStage.show();
    }
    private void addBouncyBall(final Scene scene) {
        final Circle ball = new Circle(100, 100, 20);

        RadialGradient gradient1 = new RadialGradient(0,
                .1,
                100,
                100,
                20,
                false,
                CycleMethod.NO_CYCLE,
                new Stop(0, Color.rgb(78,123,200)),
                new Stop(1, Color.rgb(234,23,150)));

        ball.setFill(gradient1);

        final Group root = (Group) scene.getRoot();
        root.getChildren().add(ball);

    }
}