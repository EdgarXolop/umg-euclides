package euc.xolop.math;

import java.util.ArrayList;
import java.util.List;

public class Euclides {

	static List<Double> lResiduo = new ArrayList<Double>();
	static List<Double> lDivisor = new ArrayList<Double>();
	static List<Double> lCociente = new ArrayList<Double>();

	public static double algoritmo(double dividendo,double divisor){
		double residuo =  dividendo % divisor;
		double cociente = Math.floor(dividendo/divisor);

		lResiduo.add(residuo);
		lCociente.add(cociente);

		System.out.println("Dividendo : " + dividendo + "   Divisor : " + divisor + "   Cociente : " + cociente);
		if(residuo == 0 ){
			return divisor;
		}else{
			lDivisor.add(residuo);
			algoritmo(divisor,residuo);
		}

		return  lDivisor.get(lDivisor.size() - 1);
	}

}
