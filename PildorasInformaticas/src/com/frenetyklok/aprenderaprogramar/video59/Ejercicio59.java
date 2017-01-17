package com.frenetyklok.aprenderaprogramar.video59;

import java.util.Scanner;

public class Ejercicio59 {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);
		String entrada = escaner.nextLine();
		escaner.close();
		
		
		int i = 0;
		
		while(i < entrada.length()){
			System.out.println("Letra " + (i + 1) + " = " + entrada.charAt(i));
			i++;
		}

	}

}
