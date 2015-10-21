package euc.xolop.main;

import java.util.Timer;
import java.util.TimerTask;

import euc.xolop.animate.ResizeAnimation;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application{


@Override
public void start(Stage stage) throws Exception {
    stage.setTitle("Algoritmo de Euclides");
    Group root = new Group();
    Scene scene  = new Scene(root, 250, 550);
    stage.setResizable(false);

    ResizeAnimation resize =  new ResizeAnimation();

    resize.start(stage, 400, 0, 0, 10);

    Rectangle rect = new Rectangle (100, 40, 100, 100);
    rect.setArcHeight(50);
    rect.setArcWidth(50);
    rect.setFill(Color.VIOLET);

    RotateTransition rt = new RotateTransition(Duration.millis(3000), rect);
    rt.setByAngle(360);
//    rt.setAutoReverse(true);

    rt.play();

    root.getChildren().add(rect);

    stage.setScene(scene);
    stage.show();
}


	public static void main(String[] args) {
	    launch(args);
	}

}
