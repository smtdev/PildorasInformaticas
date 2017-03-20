package com.frenetyklok.avanzado.t24;

import java.util.Set;//interface
import java.util.HashSet;//clase
import java.util.Iterator;
import java.util.SortedSet;//interface
import java.util.TreeSet;//clase



public class Programa {
	
	public static void main(String[] args){
		
		Set<Persona> cjsp = new HashSet<Persona>();
		SortedSet<Persona> cjssp = new TreeSet<Persona>();
		Persona p = new Persona(1, "Marta", 165);
		cjsp.add(p);
		cjssp.add(p);
		p = new Persona(2, "Elena", 155);
		cjsp.add(p);
		cjssp.add(p);
		p = new Persona(3, "María", 170);
		cjsp.add(p);
		cjssp.add(p);
		System.out.println("Personas en el conjunto: " + cjsp);
		System.out.println("Personas en el conjunto ordenado: " + cjssp);//no hace falat poner toString()
		
		Persona p2 = p;
		cjsp.add(p);
		System.out.println(cjsp);//no se pueden repetir los elementos
		System.out.println(cjsp.contains(p2));
		System.out.println(p);
		System.out.println(p2);
		
		System.out.println(cjssp.first());
		
		System.out.println("******");
		
		Iterator<Persona> it = cjsp.iterator();
		while(it.hasNext()){
			Persona tmp = it.next();
			System.out.println(tmp);
		}
		
		System.out.println("*******");
		
		Iterator<Persona> it1 = cjssp.iterator();
		while(it1.hasNext()){
			Persona tmp = it1.next();
			System.out.println(tmp);
		}
		
		
	}

}
