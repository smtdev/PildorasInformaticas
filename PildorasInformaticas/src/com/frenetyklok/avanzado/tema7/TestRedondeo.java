package com.frenetyklok.avanzado.tema7;

import java.util.Scanner;

public class TestRedondeo {
	
	public static void main(String[] args){
		
		System.out.println("Introduce número a redondear: ");
		Scanner escaner = new Scanner(System.in);
		double numeroARedondear = Double.parseDouble(escaner.nextLine());
		System.out.println("Introduce la cantidad de decimales:");
		int numeroDecimales = Integer.parseInt(escaner.nextLine());
		System.out.println("El resultado es: " + RedondeoDecimales.redondea2(numeroARedondear, numeroDecimales));
		escaner.close();
		
	}

}
 