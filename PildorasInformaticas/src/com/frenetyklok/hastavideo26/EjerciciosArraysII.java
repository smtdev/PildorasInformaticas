package com.frenetyklok.hastavideo26;

public class EjerciciosArraysII {
	
	public static void main(String[] args){
		
		int[] numeros = {2, 3, 5, 5, 3};
		
		int[] numerosInversos = new int[numeros.length];
		
		for(int i = 0; i < numeros.length; i++){
			int indice = (numeros.length - 1) - i;
			numerosInversos[indice] = numeros[i];
		}
		
		for(int i = 0; i < numerosInversos.length; i ++){
			System.out.println(numerosInversos[i]);
		}
		
	}

}
