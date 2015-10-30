package euc.xolop.math;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Edgar Xolop
 * Clase del algoritmo de Euclides
 */
public class Euclides {
	
	/**
	 * Listas que almacenan los resultdos
	 */
	public List<Integer> lResiduo = new ArrayList<Integer>();
	public List<Integer> lDividendo = new ArrayList<Integer>();
	public List<Integer> lCociente = new ArrayList<Integer>();

	/**
	 * Clacula el mcd con el algoritmo de euclides
	 * @param dividendo : numero mayor es el dividendo
	 * @param divisor   : numer menor es el divisor
	 * @return retorna el mcd
	 */
	public int algoritmo(Double dividendo,Double divisor){
		lDividendo.add(dividendo.intValue());//agregamos el primer dividendo

		while (divisor > 0){//si el divisor es mayor a cero seguimos con el algoritmo
			Double residuo =  dividendo % divisor; //obtenemos el residuo
			Double cociente = Math.floor(dividendo/divisor);// obtenemos un cociente mas exacto

			lDividendo.add(divisor.intValue()); //agregamos el divisor actual
			lResiduo.add(residuo.intValue()); //agregamos el residuo de la division
			lCociente.add(cociente.intValue());// agregamos el codiente de la division

			dividendo =  divisor;//el divisor pasa a ser el dividendo
			divisor = residuo;//el residuo pasa a ser el divisor

		}

		return  lDividendo.get(lDividendo.size() - 1);//el ultimo dividendo es la respuesa (cmd)
	}
	
	public List<Integer> getlResiduo() {//retorna los residuos
		return lResiduo;
	}

	public List<Integer> getlDividendo() {//retorna los dividendo
		return lDividendo;
	}

	public List<Integer> getlCociente() {//retorna los cocientes
		return lCociente;
	}

}
