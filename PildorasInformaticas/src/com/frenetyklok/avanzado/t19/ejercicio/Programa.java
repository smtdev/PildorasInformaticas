package com.frenetyklok.avanzado.t19.ejercicio;

import java.util.Iterator;

public class Programa {
	
	public static void main(String [] args){
		ListaAnimales la = new ListaAnimales();
		Iterator<Animal> it;
		Animal animal;
		
		la.getListaAnimales().add(new Animal("Rapaces", "Aguila", 10, 2));
		la.getListaAnimales().add(new Animal("Rapaces", "Halcón", 5, 2));
		la.getListaAnimales().add(new Animal("Cánidos", "Perro", 25, 4));
		
		System.out.println("Esta es la lista de animales antes de borrar: " + la.toString());
		
		it = la.iterator();
		while(it.hasNext()){
			animal = it.next();
			if(animal.getPatas() < 4) { it.remove();}
		}
		
		System.out.println("Esta es la lista de animales tras el borrado: " + la.toString());
		
	}

}
