package euc.xolop.math;

import java.util.ArrayList;
import java.util.List;

public class Euclides {

	public List<Double> lResiduo = new ArrayList<Double>();
	public List<Double> lDividendo = new ArrayList<Double>();
	public List<Double> lCociente = new ArrayList<Double>();

//	public static void main(String args[]){
//		System.out.println("El mcd es : " + algoritmo(17154,357));
//
//		System.out.print("     " );
//		for(int i = 0; i < lCociente.size(); i++){
//			System.out.print("  " + lCociente.get(i));
//		}
//		System.out.println();
//		for(int i = 0; i < lDividendo.size(); i++){
//			System.out.print("  " + lDividendo.get(i));
//		}
//		System.out.println();
//		for(int i = 0; i < lResiduo.size(); i++){
//			System.out.print("  " + lResiduo.get(i));
//		}
//	}

	public double algoritmo(double dividendo,double divisor){
		lDividendo.add(dividendo);

		while (divisor > 0){
			double residuo =  dividendo % divisor;
			double cociente = Math.floor(dividendo/divisor);

			lDividendo.add(divisor);
			lResiduo.add(residuo);
			lCociente.add(cociente);

			dividendo =  divisor;
			divisor = residuo;

		}

		return  lDividendo.get(lDividendo.size() - 1);
	}

}
