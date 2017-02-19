package com.frenetyklok.avanzado.tema6.ejercicio;

import java.util.Scanner;

public class EjercicioAvanzado6 {
	
	public static void main(String[] args){
		
		boolean bucle = true;
		Scanner escaner = new Scanner(System.in);
		int segundos;
		
		while(bucle){
			System.out.println("Introduzca el valor en segundos: ");
			segundos = Integer.parseInt(escaner.nextLine());
			System.out.println("Estamos en el minuto: " + ((int)Math.floor(segundos/60)));
			System.out.println("Otro valor? (y\\n):");
			String respuesta = escaner.nextLine();
			if(!respuesta.equals("Y") && !respuesta.equals("y")){
				bucle = false;
			}
		}
		System.out.println("Programa terminado!");
		escaner.close();
		
	}

}
