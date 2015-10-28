package euc.xolop.math;

import java.util.ArrayList;
import java.util.List;

public class Euclides {

	public List<Integer> lResiduo = new ArrayList<Integer>();
	public List<Integer> lDividendo = new ArrayList<Integer>();
	public List<Integer> lCociente = new ArrayList<Integer>();

	public int algoritmo(Double dividendo,Double divisor){
		lDividendo.add(dividendo.intValue());

		while (divisor > 0){
			Double residuo =  dividendo % divisor;
			Double cociente = Math.floor(dividendo/divisor);

			lDividendo.add(divisor.intValue());
			lResiduo.add(residuo.intValue());
			lCociente.add(cociente.intValue());

			dividendo =  divisor;
			divisor = residuo;

		}

		return  lDividendo.get(lDividendo.size() - 1);
	}

}
