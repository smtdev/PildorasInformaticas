package com.frenetyklok.hastavideo26;

import java.util.Arrays;

import com.frenetyklok.util.MetodosUtil;

//TENEMOS QUE GENERAR UN ARRAY CON NUMEROS ALEATORIOS QUE NO SE REPITAN

public class EjerciciosArraysV {

	public static void main(String[] args) {
		
		int minimo = 1;
		int maximo = 10;
		int longitud = 10;
		
		MetodosUtil a = new MetodosUtil();
		
		//CONTROLAMOS QUE EL VALOR MAXIMO SEA MAYOR QUE EL MINIMO
		
		if(maximo < minimo){
			int aux = maximo;
			maximo = minimo;
			minimo = aux;
		}
		
		//CONTROLAMOS QUE LA LONGITUD NO SEA MAYOR QUE EL RANGO DE VALORES DISPONIBLES
		//GENERAMOS LOS NUMEROS
		
		//COMO EJERCICIO SE PROPONE HACER DE ESTO UNA FUNCIÓN A LA QUE LE PASEMOS COMO
		//PARAMETROS MAXIMO MINIMO Y LONGITUD
		
		if((maximo - minimo + 1) >= longitud){
			
			int numeroElementos = 0;
			int numeros[] = new int[longitud];
			boolean encontrado;
			int aleatorio;
			
			while(numeroElementos < longitud){
				
				encontrado = false;
				
				aleatorio = a.generaEnteroAleatorioRandom(maximo, minimo);
				
				for(int i = 0; i < numeros.length && !encontrado; i++){
					if(aleatorio == numeros[i]){
						encontrado = true;
					}
				}
				
				if(encontrado){
					
					System.out.println("El numero existe: " + aleatorio);
					
				}else{
					
					numeros[numeroElementos++] = aleatorio;
					System.out.println("Agregado el número: " + aleatorio);
					
				}
				
				System.out.println("Mostrar arreglo:");
				
				for(int i = 0; i < numeros.length; i++){
					System.out.print(numeros[i] + " ");
				}
				
			}
			
		}else {
			System.out.println("No se puede hacer!");
		}
		
		
		
		
	}

}
