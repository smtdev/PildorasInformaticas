package com.frenetyklok.aprenderaprogramar.video79;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio79 {
	
	public static void main(String[] args){
		
		Boolean[] miArrayBooleano = {true, true, false, false, true, false};
		
		List<Boolean> miLinkedListBooleana = new LinkedList<Boolean>();
		
		/*
		 * NO SE PUEDE HACER LO SIGUIENTE PORQUE ASLIST DEVUELVE UN OBJETO DE TIPO LIST
		 * Y EL CAST A LINKEDLIST DA ERROR
		 */
		
		//LinkedList<Boolean> miLinkedListBooleana = new LinkedList<Boolean>();
		
		miLinkedListBooleana = Arrays.asList(miArrayBooleano);

		/*
		 * EN LA LINEA ANTERIOR NO HACE FALTA HACER CAST YA QUE HAY CONINCIDENCIA PORUQE
		 * miLinkedListBooleana es un objeto de tipo List
		 */
		
		System.out.println(miLinkedListBooleana);
		
	}

}
