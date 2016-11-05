package com.frenetyklok.video10;

public class CalculosConMathII {

	public static void main(String[] args) {
		
		double numeroUno = 5.85F;
		//int resultado = Math.round(numeroUno); //este m�todo nos devuleve un long por eso da error
		
		int resultado = (int)Math.round(numeroUno); //ahora s� que funciona correctamente
		
		System.out.println(resultado);
		
		//vemos ahora otros ejemplos de refundici�n
		
		long largo = 8979989898798798797L;
		int entero = 897998987;
		
		int result = (int)largo;
		long result2 = (long)entero;
		
		System.out.println(result);//en este caso el numero resultante no tiene nada que ver con el long
		System.out.println(result2);// en este caso no hay problema para guardar el n�mero
		
		//vemos ahora otros m�todos de Math
		
		double base = 5;
		double exponente = 3;
		
		//resultado = Math.pow(base, exponente); el resultado es de tipo double y no ponemos guardarlo en resultado
		
		resultado = (int)Math.pow(base, exponente);//ahora s� que podemos guardar el resultado.
		
	}

}
