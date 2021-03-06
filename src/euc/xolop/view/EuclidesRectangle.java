package euc.xolop.view;

import euc.xolop.animation.RectangleAnimation;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class EuclidesRectangle extends Label{

	public EuclidesRectangle(String color){
		super();
		this.setTextAlignment(TextAlignment.CENTER);
		this.setStyle("-fx-background-color: " + color + "; -fx-border-radius: 2 2 2 2; -fx-background-radius: 2 2 2 2; ");
		this.setPrefSize(11, 11);
	}

	public EuclidesRectangle(String text,String color){
		super(text);
		this.setTextAlignment(TextAlignment.CENTER);
		this.setStyle("-fx-background-color: " + color + "; -fx-border-radius: 2 2 2 2; -fx-background-radius: 2 2 2 2; ");
		this.setPrefSize(11, 11);
	}


	public void animate(){
	    this.setTextFill(Color.web("#FFFFFF"));
		this.setFont(Font.font(4));
		RectangleAnimation.start(this, RectangleAnimation.SCALE_5);
	}

}
