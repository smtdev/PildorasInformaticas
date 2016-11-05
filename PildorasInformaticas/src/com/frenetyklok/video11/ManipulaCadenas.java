package com.frenetyklok.video11;

public class ManipulaCadenas {

	public static void main(String[] args) {
		
		String nombre = "Pablo";
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " caracteres.");
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
		
		int ultimaLetraPosicion = nombre.length() - 1;
		System.out.println("La última letra de " + nombre + " es la " + nombre.charAt(ultimaLetraPosicion));
		

	}

}
