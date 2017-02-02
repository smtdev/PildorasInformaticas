package com.frenetyklok.aprenderaprogramar.video79;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAsList {
	
	public static void main(String[] args){
		
		List<String> miListaDePalabras = new ArrayList<String>();
		
		String[] miArrayDePalabras = {"Oso", "León", "Buey", "Guepardo"};
		
		System.out.println("Contenido inicial del ArrayList: " + miListaDePalabras);
		
		miListaDePalabras = Arrays.asList(miArrayDePalabras);
		
		System.out.println("Contenido actual del ArrayList: " + miListaDePalabras);
		
		System.out.println("");
		
		List<Integer> miListaDeEnteros = new ArrayList<Integer>();
		
		Integer[] miArrayDeEnteros = {11, -34, 56, 78};
		
		System.out.println("Contenido inicial del ArrayList: " + miListaDeEnteros);
		
		miListaDeEnteros = Arrays.asList(miArrayDeEnteros);
		
		System.out.println("Contenido actual del ArrayList: " + miListaDeEnteros);
	}

}
