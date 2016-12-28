package com.frenetyklok.hastavideo26;

import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		
		
		int[] numeros = {1,7,4,75,1};
		Arrays.sort(numeros);
		int resultado = Arrays.binarySearch(numeros, 7);
		System.out.println(resultado);
		

	}

}
