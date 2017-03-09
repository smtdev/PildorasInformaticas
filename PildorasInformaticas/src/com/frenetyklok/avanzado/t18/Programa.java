package com.frenetyklok.avanzado.t18;

import java.util.ArrayList;
import java.util.Collections;

public class Programa {
	
	public static void main(String[] args){
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(new Persona(1, "María", 185));
		listaPersonas.add(new Persona(2, "Carla", 155));
		listaPersonas.add(new Persona(3, "Yovana", 167));
		
		//Collections.sort(listaPersonas, new OrdenarPersonaPorAltura());
		listaPersonas.sort(new OrdenarPersonaPorAltura());//se puede hacer de las dos formas??
		
		System.out.println("Personas ordenadas por orden total: " + listaPersonas);
	}

}
