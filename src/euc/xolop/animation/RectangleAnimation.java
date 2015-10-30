package euc.xolop.animation;

import euc.xolop.view.EuclidesRectangle;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.util.Duration;
/**
 * 
 * @author Edgar Xolop
 * Animacion que se le aplica la albel para el rotacion y aumentar tamano
 */
public class RectangleAnimation {
	/**
	 * Constante, que indica a la escala que aumentara el label
	 */
	public static final double SCALE_5 = 6F;

	/**
	 * Inicia la animacion para cada label
	 * @param rect 	: label al que queremos animar 
	 * @param scale	: la escala en la que queremos que aumentemos
	 */
	public static void start(EuclidesRectangle rect,double scale){

	    RotateTransition rt = new RotateTransition(Duration.millis(1000), rect);
	    rt.setByAngle(720);
	    rt.play();

	    ScaleTransition st = new ScaleTransition(Duration.millis(1000),rect);
	    st.setToX(scale);
	    st.setToY(scale);
	    st.play();
	}
}
