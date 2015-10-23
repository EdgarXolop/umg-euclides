package euc.xolop.view;

import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Pane{
	public static int ROWS = 2;
	private BorderPane border;
	private GridPane grid;
	private GridPane flow;
	private Label lblN1;
	private Label lblN2;
	private Label lblError;
	private Label lblRes;
	private TextField tfFirstNumber;
	private TextField tfSecondNumber;
	private Button btnCalc;
	private Button btnClear;

	public Pane(){
		border = new BorderPane();
		border.setPrefHeight(250);

		createForm();
		createTableEuclides();
		border.setLeft(grid);
		border.setRight(flow);
	}

	private void createForm(){
		grid 			= new GridPane();
		lblN1 			= new Label("Primer número:");
		tfFirstNumber 	= new TextField();
		lblN2 			= new Label("Segundo número:");
		tfSecondNumber 	= new TextField();
		btnCalc 		= new Button("    Calcular    ");
		btnClear		= new Button(" Limpmiar ");
		lblError		= new Label();
		lblRes			= new Label();

		lblError.setTextFill(Color.web("#f44336"));
		lblRes.setTextFill(Color.web("#4caf50"));

		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(12);
		grid.setPadding(new Insets(0,20,0,20));

		tfFirstNumber.setPrefWidth(75);
		tfSecondNumber.setPrefWidth(75);

	    grid.add(lblN1, 0, 0);
	    grid.add(tfFirstNumber, 1, 0);
	    grid.add(lblN2, 0, 1);
	    grid.add(tfSecondNumber, 1, 1);
	    grid.add(btnCalc, 0, 2);
	    grid.add(btnClear, 1, 2);
	    grid.add(lblError,0,3,2,1);
	    grid.add(lblRes,0,4,2,1);
	}

	private void createTableEuclides(){
		flow = new GridPane();
		flow.setHgap(60);
		flow.setVgap(60);
		flow.setAlignment(Pos.CENTER);
		flow.setPadding(new Insets(0,20,0,20));

	}

	public void generateTable(List<Integer> res, List<Integer> div, List<Integer> coc){

		EuclidesRectangle f = new EuclidesRectangle(10, 10, 10, 10);
	    f.setArcHeight(5);
	    f.setArcWidth(5);
	    f.setFill(Color.WHITE);

        flow.add(f,0,0);
        f.animate();

		for(int i = 1 ; i <= coc.size() ; i++){
			EuclidesRectangle rect = new EuclidesRectangle(10, 10, 10, 10);
		    rect.setArcHeight(5);
		    rect.setArcWidth(5);
		    rect.setFill(Color.GRAY);
	        flow.add(rect,i,0);
	        flow.add(new Label(String.valueOf(coc.get(i-1))),i,0);
	        rect.animate();

		}
		for(int i = 0 ; i < div.size() ; i++){
			EuclidesRectangle rect = new EuclidesRectangle(10, 10, 10, 10);
		    rect.setArcHeight(5);
		    rect.setArcWidth(5);
		    rect.setFill(Color.GRAY);
	        flow.add(rect,i,1);
	        flow.add(new Label(String.valueOf(div.get(i))),i,1);
	        rect.animate();

		}
		for(int i = 0 ; i < res.size() ; i++){
			EuclidesRectangle rect = new EuclidesRectangle(10, 10, 10, 10);
		    rect.setArcHeight(5);
		    rect.setArcWidth(5);
		    rect.setFill(Color.GRAY);
	        flow.add(rect,i,2);
	        flow.add(new Label(String.valueOf(res.get(i))),i,2);
	        rect.animate();

		}

	}

	public BorderPane getPane(){
		return border;
	}
	public GridPane getGrid(){
		return grid;
	}
	public GridPane getFlow(){
		return flow;
	}
	public TextField getTxtFirstNumber(){
		return tfFirstNumber;
	}
	public TextField getTxtSecondNumber(){
		return tfSecondNumber;
	}
	public Label getLblError(){
		return lblError;
	}
	public Label getLblRes(){
		return lblRes;
	}
	public Button getBtnCalc(){
		return btnCalc;
	}
	public Button getBtnClear(){
		return btnClear;
	}
}
