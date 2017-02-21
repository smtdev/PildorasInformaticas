package com.frenetyklok.avanzado.tema7.ejercicio;

import java.math.*;
import java.util.Scanner;

public class ImporteFinal {
	
	public static void main(String[] args){
		
		System.out.println("Empieza el programa: ");
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Introduce el importe inicial: ");
		double importeInicial = Double.parseDouble(escaner.nextLine());
		
		System.out.println("Introduce el valor de impuestos: ");
		double impuestos = Double.parseDouble(escaner.nextLine());
		
		BigDecimal importeInicialBig = BigDecimal.valueOf(importeInicial);
		BigDecimal impuestosBig = BigDecimal.valueOf(impuestos);
		
		BigDecimal valorImpuestos = importeInicialBig.multiply(impuestosBig).divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
		
		System.out.println("El impuesto a pagar es: " + valorImpuestos);
		System.out.println("El importe final es: " + (valorImpuestos.add(importeInicialBig)));
		
	}

}
