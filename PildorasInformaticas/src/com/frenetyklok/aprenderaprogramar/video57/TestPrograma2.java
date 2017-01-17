package com.frenetyklok.aprenderaprogramar.video57;

import java.util.Scanner;

public class TestPrograma2 {
	
	public static void main(String[] args){
		Scanner escaner = new Scanner(System.in);
		System.out.println("Por favor, introduce una cadena:");
		
		String cadena = escaner.nextLine();
		
		if(cadena.length() < 5){
			System.out.println("La cadena tiene menos de 5 caracteres!");
		}else if(cadena.length() >= 5 && cadena.length() <= 15){
			System.out.println("La cadena tiene entre 5 y 15 caracteres!");
		}else{
			System.out.println("La cadena tiene más de 15 caracteres!");
		}
		
		if(cadena.charAt(0) == 'a' || cadena.charAt(0) == 'A'){
			System.out.println("La cadena empieza por a!");
		}else{
			System.out.println("La cadena no empieza por a!");
		}
	}

}
