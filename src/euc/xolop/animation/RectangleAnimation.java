package euc.xolop.animation;

import euc.xolop.shape.EuclidesRectangle;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.util.Duration;

public class RectangleAnimation {
	public static final double SCALE_5 = 5F;

	public static void start(EuclidesRectangle rect,double scale){

	    RotateTransition rt = new RotateTransition(Duration.millis(3000), rect);
	    rt.setByAngle(720);
	    rt.play();

	    ScaleTransition st = new ScaleTransition(Duration.millis(3000),rect);
	    st.setToX(scale);
	    st.setToY(scale);
	    st.play();
	}
}
