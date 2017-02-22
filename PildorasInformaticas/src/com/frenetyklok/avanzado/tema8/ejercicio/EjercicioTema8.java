package com.frenetyklok.avanzado.tema8.ejercicio;

import java.util.Random;
import java.util.Scanner;

public class EjercicioTema8 {
	
	public static void main(String[] args){
		
		System.out.println("Comenzamos el juego de adivinar el número!!");
		
		Scanner escaner = new Scanner(System.in);
		
		int minimo, maximo, intentos;
		
		boolean seguir = true;
		Random rdm = new Random();
		
		while(seguir){
			
			System.out.println("Introduce el valor máximo del rango: ");
			maximo = Integer.parseInt(escaner.nextLine());
			System.out.println("Introduce el valor mínimo del rango: ");
			minimo = Integer.parseInt(escaner.nextLine());
			System.out.println("Introduce el número de intentos disponibles: ");
			intentos = Integer.parseInt(escaner.nextLine());
			
			boolean[] aciertos = new boolean[intentos];
			int[] valoresPensados = new int[intentos];
			int[] valoresApostados = new int[intentos];
			String[] ordinales = {"primer", "segundo", "tercer", "cuarto", "quinto", "sexto", "séptimo"}; 
			//cuidado, la anterior linea nos dará un error ArrayIndexOutOfBoundsException si el número de intentos 
			//es superior al número de elementos de ordinales
			
			for(int i = 1; i <= intentos; i++){
				
				int valorPensado = (int)(rdm.nextDouble()*(maximo - minimo + 1)+ minimo);
				valoresPensados[(i-1)] = valorPensado;
				System.out.println("Introduce un valor: ");
				int valorApostado = Integer.parseInt(escaner.nextLine());
				valoresApostados[(i-1)] = valorApostado;
				if(valorPensado == valorApostado){
					aciertos[(i-1)] = true;
				}else{
					aciertos[(i-1)] = false;
				}
			}
			
			for(int i = 1; i <= intentos; i++){
				System.out.println("El " + ordinales[(i-1)] + " valor pensado era: " + valoresPensados[(i-1)]);
				System.out.println("Tu dijise: " + valoresApostados[(i-1)]);
				System.out.println("La respuesta es: " + aciertos[(i-1)]);
			}
			
			System.out.println("Quieres seguir jugando (y-n)?");
			String continuar = escaner.nextLine();
			if(!continuar.equals("Y") && !continuar.equals("y")){
				seguir = false;
			}
		}
		System.out.println("Hasta la próxima!");
		escaner.close();
		
		
	}

}
