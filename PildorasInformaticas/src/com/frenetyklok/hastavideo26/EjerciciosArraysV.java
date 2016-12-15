package com.frenetyklok.hastavideo26;

import java.util.Arrays;

import com.frenetyklok.util.MetodosUtil;

//TENEMOS QUE GENERAR UN ARRAY CON NUMEROS ALEATORIOS QUE NO SE REPITAN

public class EjerciciosArraysV {

	public static void main(String[] args) {
		
		MetodosUtil a = new MetodosUtil();
		
		int[] numeros = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		for(int i = 0; i < numeros.length; i++){
			numeros[i] = a.generaEnteroAleatorioRandom(10, 1);
			
			for(int j = 0; j < i; j++){
				while(numeros[i] == numeros[j]){
					numeros[i] = a.generaEnteroAleatorioRandom(10, 1);
				}
			}
		}
		
		for(int i = 0; i < numeros.length; i++){
			System.out.print(numeros[i] + " ");
		}
	}

}
