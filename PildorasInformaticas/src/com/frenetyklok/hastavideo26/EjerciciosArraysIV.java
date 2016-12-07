package com.frenetyklok.hastavideo26;

import java.util.Arrays;

public class EjerciciosArraysIV {

	public static void main(String[] args) {


		//ORDENAR UN ARRAY CON EL METODO SORT
		
		int[] numeros = {1, 3, 1 ,2 ,5, 4};
		
		Arrays.sort(numeros, 1, 4);
		
		for(int i = 0; i < numeros.length; i++){
			System.out.println(numeros[i]);
		}

	}

}
