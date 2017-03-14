package com.frenetyklok.avanzado.t21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Programa {
	
	public static void main(String[] args){
		
		List<Persona> listaArray = new ArrayList<Persona>();
		List<Persona> listaLinked = new LinkedList<Persona>();
		
		long antes;
		
		for(int i = 0; i < 10000; i++){
			listaArray.add(new Persona(i, "Persona"+i, i));
			listaLinked.add(new Persona(i, "Persona"+i, i));
		}
		
		System.out.println("Tiempo invertido en insertar una persona en ArrayList: ");
		antes = System.nanoTime();
		listaArray.add(0, new Persona(1001, "Prueba" , 1001));
		System.out.println("Tiempo: " + (System.nanoTime() - antes) + " nanosegundos");
		
		System.out.println();
		
		System.out.println("Tiempo invertido en insertar una persona en LinkedList: ");
		antes = System.nanoTime();
		listaLinked.add(0, new Persona(1001, "Prueba" , 1001));
		System.out.println("Tiempo: " + (System.nanoTime() - antes) + " nanosegundos");
		
	}

}
