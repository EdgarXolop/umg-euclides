package euc.xolop.animation;

import java.util.Timer;
import java.util.TimerTask;

import javafx.stage.Stage;
/**
 * 
 * @author Edgar Xolop
 * Crea la animacion tipo rezise para los objetos tipo Stage
 */
public class ResizeAnimation extends Timer {
/**
 * Constructor publico
 */
	public ResizeAnimation(){}
/**
 * Anima el objeto tipo Stage
 * @param obj		: el objeto que se va a animar
 * @param width		: ancho que se desea incrementar
 * @param height 	: la altuta que se desea incrementar
 * @param delay		: tiempo para que empieze la animacion (milisegundos)
 * @param period 	: el tiempo que va a durarla animacion (milisegundos)
 */
	public void start(final Stage obj,final int width,final int height,final long delay,final long period){

		this.scheduleAtFixedRate(
			new TimerTask() {

		        int i=0;
		        @Override
		        public void run() {
		            if (i<width){
			            obj.setWidth(obj.getWidth()+1);
		            }

		            if (i<height){
		            	obj.setWidth(obj.getHeight()+1);
		            }

		            if(i >= width  &&  i >= height){
		                this.cancel();
		            }

		            i++;
		        }
		    }
		,delay, period);

	}

}
