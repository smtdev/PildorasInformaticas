package com.frenetyklok.video14;

import java.util.Scanner;

public class EntradaI {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //creamos un Scanner que tomará datos de entrada por consola.
		
		System.out.println("Introduce tu nombre por favor: ");	
		String cadena = entrada.nextLine();
		
		System.out.println("Introduce tu edad por favor: ");
		int edad = entrada.nextInt();
		
		System.out.println("Introduce tu peso por favor: ");//ojo hay que poner el número con coma y no con punto
		double peso = entrada.nextDouble();
		
		System.out.println("Tu nombre es " + cadena);
		System.out.println("Tu edad es: " + edad);
		System.out.println("Tu peso es: " + peso);
		
		entrada.close();// mejor cerrar el scanner

	}

}
