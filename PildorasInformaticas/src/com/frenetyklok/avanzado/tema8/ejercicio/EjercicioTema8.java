package com.frenetyklok.avanzado.tema8.ejercicio;

import java.util.Random;
import java.util.Scanner;

public class EjercicioTema8 {
	
	public static void main(String[] args){
		
		System.out.println("Comenzamos el juego de adivinar el n�mero!!");
		
		Scanner escaner = new Scanner(System.in);
		
		int minimo, maximo, intentos;
		
		boolean seguir = true;
		Random rdm = new Random();
		
		while(seguir){
			
			System.out.println("Introduce el valor m�ximo del rango: ");
			maximo = Integer.parseInt(escaner.nextLine());
			System.out.println("Introduce el valor m�nimo del rango: ");
			minimo = Integer.parseInt(escaner.nextLine());
			System.out.println("Introduce el n�mero de intentos disponibles: ");
			intentos = Integer.parseInt(escaner.nextLine());
			
			boolean[] aciertos = new boolean[intentos];
			int[] valoresPensados = new int[intentos];
			int[] valoresApostados = new int[intentos];
			String[] ordinales = {"primer", "segundo", "tercer", "cuarto", "quinto", "sexto", "s�ptimo"}; 
			//cuidado, la anterior linea nos dar� un error ArrayIndexOutOfBoundsException si el n�mero de intentos 
			//es superior al n�mero de elementos de ordinales
			
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
		System.out.println("Hasta la pr�xima!");
		escaner.close();
		
		
	}

}
