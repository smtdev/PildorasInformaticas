package com.frenetyklok.avanzado.tema5;

public class Programa2 {
	
	public static void main(String[] args){
		int[] numeroDeCoches = new int[24];
		int a = 8;
		int b = 4;
		int r = a / b;
		numeroDeCoches[r] = 23;
		
		System.out.println("Para el valor de r: " + r + " el valor del array es: " + numeroDeCoches[r]);
	}

}
