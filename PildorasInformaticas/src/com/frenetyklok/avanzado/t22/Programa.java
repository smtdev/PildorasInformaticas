package com.frenetyklok.avanzado.t22;

import java.util.Vector;

public class Programa {
	
	public static void main(String[] args){
		Vector<Persona> v = new Vector<Persona>();
		System.out.println("La capacidad inicial del vector es: " + v.capacity());
		
		int i = 0;
		
		while(i < 15){
			v.add(new Persona(i, "Persona" + i, i));
			i++;
		}
		
		System.out.println("La capacidad actual del vector es: " + v.capacity());
		
		v.trimToSize();
		
		System.out.println("La capacidad actual del vector es: " + v.capacity());
		
		v.ensureCapacity(50);
		
		System.out.println("La capacidad actual del vector es: " + v.capacity());
	}

}
