package com.frenetyklok.video24;

import javax.swing.JOptionPane;

public class UsoArraysII {

	public static void main(String[] args) {
		
		String[] paises = new String[8];
		
		paises[0] = "España";
		paises[1] = "México";
		paises[2] = "Colombia";
		paises[3] = "Perú";
		paises[4] = "Chile";
		paises[5] = "Argentina";
		paises[6] = "Ecuador";
		paises[7] = "Venezuela";
		
		for(int i = 0; i < paises.length; i++){
			System.out.println(paises[i]);
		}
		
		System.out.println();
		System.out.println("Ahora lo haremos con un bucle for each");
		
		
		//este es el bucle for each. lo que hace es recorrer todos los elementos del array
		for (String elemento : paises) {
			System.out.println(elemento);
		}
		
		//también podemos cargar el array con los datos añadidos por el usuario
		
		String[] ciudades = new String[3];
		
		for(int i = 0; i < ciudades.length; i++){
			
			ciudades[i] = JOptionPane.showInputDialog("Introduce ciudad");
		}
		System.out.println();
		System.out.println("Ahora mostrará las ciudades que has introducido");
		for(String ciudad : ciudades){
			System.out.println(ciudad);
		}
		

	}

}
