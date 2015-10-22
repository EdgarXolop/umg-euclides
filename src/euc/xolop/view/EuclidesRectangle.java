package euc.xolop.view;

import euc.xolop.animation.RectangleAnimation;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class EuclidesRectangle extends Rectangle{

	public EuclidesRectangle(){
		super();
	}

	public EuclidesRectangle(double width,double height){
		super(width,height);
	}

	public EuclidesRectangle(double x, double y, double width, double height) {
		super(x,y,width,height);
	}

	public EuclidesRectangle(double width, double height, Paint fill){
		super(width,height,fill);
	}

	public void animate(){
		RectangleAnimation.start(this, RectangleAnimation.SCALE_5);
	}

}
