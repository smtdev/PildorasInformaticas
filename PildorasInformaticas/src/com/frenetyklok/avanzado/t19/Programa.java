package com.frenetyklok.avanzado.t19;

import java.util.Iterator;

public class Programa {
	
	public static void main(String[] args){
		ListaPersonas lp = new ListaPersonas();
		Iterator<Persona> it;
		Persona persona;
		
		lp.getListaPersonas().add(new Persona(1, "María", 173));
		lp.getListaPersonas().add(new Persona(2, "Carla", 187));
		lp.getListaPersonas().add(new Persona(3, "Enriqueta", 164));
		
		System.out.println("Lista antes de eliminar las que miden menos de 170:" + lp.toString());
		
		it = lp.iterator();
		
		while(it.hasNext()){
			persona = it.next();
			if(persona.getAltura() < 170){ it.remove();}
		}
		
		System.out.println("Lista tras las eliminaciones: " + lp.toString());
		
	}

}
