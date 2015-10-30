package euc.xolop.main;

import euc.xolop.math.Euclides;
//import euc.xolop.animation.ResizeAnimation;
import euc.xolop.view.Pane;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * 
 * @author Edgar Xolop
 * Ventana principal
 */
public class Main extends Application{

/**
 * Sobre escribimos el metodo start(Stage stage) de la clase heradada Application
 */
	@Override
	public void start(Stage stage) throws Exception {
	    stage.setTitle("Algoritmo de Euclides");// ponemos eltitulo a la ventana
	    Group root = new Group();
	    Scene scene  = new Scene(root, 750, 270);// sus dimensiones
	    stage.setResizable(false);

	    final Pane form = new Pane();

	    root.getChildren().add(form.getPane());

	    form.getBtnCalc().setOnAction((event) ->{//agreamaos el evento con un lambda
	    	try{
		    	Double first = Double.valueOf(form.getTxtFirstNumber().getText());//obtenemos los textos
		    	Double second = Double.valueOf(form.getTxtSecondNumber().getText());
		    	int result = 0;

		        Euclides euc =  new Euclides();
		        if(first > second){//ordenamos los numeros para el lagoritmo
				    result = euc.algoritmo(first, second);
		        }else{
		        	result = euc.algoritmo(second, first);
		        }
			    form.generateTable(euc.lResiduo, euc.lDividendo,euc.lCociente ); //generamos la tabla con el algoritmo de euclides
	    		form.getLblError().setText("");//limpiamos el label de error
	    		form.getLblRes().setText("El mcd es igual a : " + String.valueOf(result));//Mostramos el resultado
	    	}catch(Exception e){
	    		form.getLblError().setText("Solo se permiten números.");//entra al catch cuando el textono es numerico
	    		e.printStackTrace();
	    	}
	    });

	    form.getBtnClear().setOnAction((event) -> {//lambda que vacia los textos label y el grid para el resultado

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
