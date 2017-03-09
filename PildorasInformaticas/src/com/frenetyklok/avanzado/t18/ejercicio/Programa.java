package com.frenetyklok.avanzado.t18.ejercicio;

import java.util.ArrayList;
import java.util.Collections;

public class Programa {
	
	public static void main(String[] args){
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes.add(new Estudiante("Pedro", 18, 1));
		estudiantes.add(new Estudiante("Manuel", 19, 3));
		estudiantes.add(new Estudiante("Eufrasio", 17, 2));
		estudiantes.add(new Estudiante("Gumersindo", 25, 4));
		estudiantes.add(new Estudiante("Pancracio", 32, 5));
		
		Collections.sort(estudiantes);
		System.out.println(estudiantes.toString());
		
		Collections.sort(estudiantes, new OrdenarEstudianteEdad());
		System.out.println(estudiantes.toString());
		
		System.out.println();
		System.out.println("Los estudiantes ordenados por edad son:");
		for(Estudiante tmp: estudiantes){
			System.out.println("Nomre: " + tmp.getNombre() + "(" + tmp.getEdad() + ")");
		}
	}

}
