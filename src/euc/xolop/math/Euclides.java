package euc.xolop.math;

import java.util.ArrayList;
import java.util.List;

public class Euclides {

	public List<Integer> lResiduo = new ArrayList<Integer>();
	public List<Integer> lDividendo = new ArrayList<Integer>();
	public List<Integer> lCociente = new ArrayList<Integer>();

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

	public double algoritmo(Double dividendo,Double divisor){
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
