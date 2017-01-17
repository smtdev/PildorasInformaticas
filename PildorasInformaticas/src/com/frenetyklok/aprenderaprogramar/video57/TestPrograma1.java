package com.frenetyklok.aprenderaprogramar.video57;

import java.util.Scanner;

public class TestPrograma1 {
	
	public static void main(String[] args){
		System.out.println("Empezamos con el programa!");
		System.out.println("Por favor, introduzca una cadena por el teclado:");
		
		String entradaTeclado = "";
		
		Scanner entradaEscaner = new Scanner(System.in);//creacíon del objeto Scanner
		entradaTeclado = entradaEscaner.nextLine();
		//lo que hacemos con \" es añadir comillas
		//para el salto de linea \n
		System.out.println("La entrada recibida por el teclado es: \"" + entradaTeclado + "\"");
	}

}
