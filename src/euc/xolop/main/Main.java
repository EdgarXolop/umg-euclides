package euc.xolop.main;

import euc.xolop.animation.ResizeAnimation;
import euc.xolop.shape.EuclidesRectangle;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{


	@Override
	public void start(Stage stage) throws Exception {
	    stage.setTitle("Algoritmo de Euclides");
	    Group root = new Group();
	    Scene scene  = new Scene(root, 350, 250);
	    stage.setResizable(false);

	    ResizeAnimation resize =  new ResizeAnimation();
	    resize.start(stage, 400, 0, 0, 10);

	    final EuclidesRectangle rect = new EuclidesRectangle(10, 10, 10, 10);
	    rect.setArcHeight(5);
	    rect.setArcWidth(5);
	    rect.setFill(Color.VIOLET);

	    rect.animate();
	    root.getChildren().add(rect);

	    stage.setScene(scene);
	    stage.show();
	}


	public static void main(String[] args) {
	    launch(args);
	}

}
