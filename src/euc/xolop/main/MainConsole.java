package euc.xolop.main;

import java.util.Scanner;

import euc.xolop.math.Euclides;

public class MainConsole {
	static final String 	MATCH 	= "^[0-9]+$";

	public static void main(String[] args) {

		Scanner in 		= new Scanner(System.in);
		Euclides euc 	= new Euclides();
		String[] number = {"",""};
		int cmd			= 0;
		boolean isNum 	= false;
		double first 	= 0;
		double second	= 0;

		System.out.println("**** Algoritmo de Euclides ****");
		System.out.println();

		while(!isNum){
			System.out.println("Ingrese el primer numero");
			number[0] = in.nextLine();
			System.out.println("Ingrese el segundo numero");
			number[1]= in.nextLine();

			isNum = number[0].matches(MATCH) && number[1].matches(MATCH);


			System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n");
			if(!isNum){
				System.out.println("Solo se permiten numeros, vuelva a ingresar los datos.");
			}

		}

		first  = Double.parseDouble(number[0]);
		second = Double.parseDouble(number[1]);

		if(first > second){
			cmd = euc.algoritmo(first, second);
		}else{
			cmd = euc.algoritmo(first, second);
		}



	}

}
