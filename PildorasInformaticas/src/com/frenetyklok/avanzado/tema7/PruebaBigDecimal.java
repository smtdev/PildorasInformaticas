package com.frenetyklok.avanzado.tema7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PruebaBigDecimal {
	
	public static void main(String[] args){
		
		BigDecimal bd1 = new BigDecimal("1.8734");
		System.out.println(bd1.setScale(2, RoundingMode.HALF_UP));
		
		double f1 = 12.383;//con float no funciona... por qué??
		BigDecimal bd2 = BigDecimal.valueOf(f1);
		System.out.println(bd2);
		
		System.out.println("suma: " + bd1.add(bd2));
		System.out.println("resta: " + bd1.subtract(bd2));
		System.out.println("producto: " + bd1.multiply(bd2));
		System.out.println("división: " + (bd1.divide(bd2, 2,  RoundingMode.HALF_UP)));
		
		//COMO CREAR BIGDECIMAL A PARTIR DE DOUBLE SIN TRASLADAR IMPRECISION
		
		double a = 1.0 / 3.0;
		BigDecimal bd3 = new BigDecimal(a);
		System.out.println("Este es el valor impreciso: " + bd3);
		
		System.out.println("En estos casos mejor usar valueOf");
		BigDecimal bd4 = BigDecimal.valueOf(1.0/3.0);
		System.out.println("Este es el valor preciso: " + bd4);
		
	}

}

