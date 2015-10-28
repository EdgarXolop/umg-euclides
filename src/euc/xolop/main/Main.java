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
	    Scene scene  = new Scene(root, 750, 270);
	    stage.setResizable(false);

	    final Pane form = new Pane();

	    root.getChildren().add(form.getPane());

	    form.getBtnCalc().setOnAction((event) ->{
	    	try{
		    	Double first = Double.valueOf(form.getTxtFirstNumber().getText());
		    	Double second = Double.valueOf(form.getTxtSecondNumber().getText());
		    	int result = 0;

		        Euclides euc =  new Euclides();
		        if(first > second){
				    result = euc.algoritmo(first, second);
		        }else{
		        	result = euc.algoritmo(second, first);
		        }
			    form.generateTable(euc.lResiduo, euc.lDividendo,euc.lCociente );
	    		form.getLblError().setText("");
	    		form.getLblRes().setText("El mcd es igual a : " + String.valueOf(result));
	    	}catch(Exception e){
	    		form.getLblError().setText("Solo se permiten números.");
	    		e.printStackTrace();
	    	}
	    });

	    form.getBtnClear().setOnAction((event) -> {

		    form.getFlow().getChildren().clear();
		    form.getLblError().setText("");
		    form.getLblRes().setText("");
		    form.getTxtFirstNumber().setText("");
		    form.getTxtSecondNumber().setText("");

	    });

	    stage.setScene(scene);
	    stage.show();
	}


	public static void main(String[] args) {
	    launch(args);
	}

}
