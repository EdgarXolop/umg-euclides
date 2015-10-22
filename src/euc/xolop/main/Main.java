package euc.xolop.main;

import euc.xolop.math.Euclides;
//import euc.xolop.animation.ResizeAnimation;
import euc.xolop.view.Pane;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{


	@Override
	public void start(Stage stage) throws Exception {
	    stage.setTitle("Algoritmo de Euclides");
	    Group root = new Group();
	    Scene scene  = new Scene(root, 750, 250);
	    stage.setResizable(false);

//	    ResizeAnimation resize =  new ResizeAnimation();
//	    resize.start(stage, 400, 0, 0, 10);

	    final Pane form = new Pane();

	    root.getChildren().add(form.getPane());

	    form.getBtnCalc().setOnAction((event) ->{
	    	Double first = Double.valueOf(form.getTxtFirstNumber().getText());
	    	Double second = Double.valueOf(form.getTxtSecondNumber().getText());

		    form.getFlow().getChildren().clear();

	        Euclides euc =  new Euclides();
	        if(first > second){
			    euc.algoritmo(first, second);
	        }else{
	        	euc.algoritmo(second, first);
	        }
		    form.generateTable(euc.lResiduo, euc.lDividendo,euc.lCociente );
	    });

	    stage.setScene(scene);
	    stage.show();
	}


	public static void main(String[] args) {
	    launch(args);
	}

}
