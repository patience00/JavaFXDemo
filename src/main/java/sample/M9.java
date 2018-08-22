package sample;
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
 * @date 2018-08-20 22:58
 * 如何使用线性渐变来绘制矩形。
 **/
public class M9 extends Application {

    @Override
    public void start(Stage stage) {
        VBox box = new VBox();
        final Scene scene = new Scene(box, 300, 250);
        scene.setFill(null);
        Stop[] stops = new Stop[] { new Stop(0, Color.BLACK), new Stop(1, Color.rgb(67,89,190)) };
        LinearGradient lg1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);

        Rectangle r1 = new Rectangle(0, 0, 100, 100);
        r1.setFill(lg1);

        box.getChildren().add(r1);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
