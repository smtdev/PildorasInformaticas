package com.frenetyklok.avanzado.t13.ejercicio;

import java.util.Arrays;

public class Programa {
	
	public static void main(String[] args){
		Persona[] personas = new Persona[5];
		personas[0] = new Persona("Andrés", 184, 24);
		personas[1] = new Persona("Pablo", 174, 41);
		personas[2] = new Persona("Gervasio", 177, 41);
		personas[3] = new Persona("Anastasio", 187, 53);
		personas[4] = new Persona("Gumersindo", 165, 43);
		
		for(Persona tmp: personas){
			System.out.println(tmp);
		}
		
		System.out.println();
		System.out.println("Ahora ordenamos el array:");
		
		Arrays.sort(personas);//existen variantes de este metodo en los que se usa Comparator
		for(Persona tmp: personas){
			System.out.println(tmp);
		}
		
		System.out.println();
		System.out.println("Ahora vamos a utilizar comparator:");
		
		//Comparator<Persona> comparator = new Comparator<Persona>;
		//nos queda pendiente usar Comparator
		//javamexico ordenar objetos por dos o mas atributos (busqueda en google).
		
		
		
	}

}
