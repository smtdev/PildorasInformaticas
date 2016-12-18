package com.frenetyklok.hastavideo26;

import java.util.Arrays;

import com.frenetyklok.util.MetodosUtil;

//TENEMOS QUE GENERAR UN ARRAY CON NUMEROS ALEATORIOS QUE NO SE REPITAN

public class EjerciciosArraysV {

	public static void main(String[] args) {
		
		MetodosUtil a = new MetodosUtil();
		
		int[] numeros = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for(int i = 0; i < numeros.length; i++){
			numeros[i] = a.generaEnteroAleatorioRandom(10, 1);
			
			int[] compara = Arrays.copyOfRange(numeros, 0, i);
			boolean indicador = false;
			
			while(indicador == false){
				for(int j = 0; j < compara.length; j++){
					if(numeros[i] != compara[j]){
						indicador = true;
					}else{
						numeros[i] = a.generaEnteroAleatorioRandom(10, 1);
						indicador = false;
					}
				}
			}
			
			
		}
		
		for(int i = 0; i < numeros.length; i++){
			System.out.print(numeros[i] + " ");
		}
	}

}
