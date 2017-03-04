package com.frenetyklok.avanzado.t15;

public class Programa {
	
	public static void main(String[] args){
		
		Persona p1 = new Persona(123123, 24);
		Persona p2 = new Persona(321321, 42);
		Persona p3 = new Persona(987987, 35);
		
		Persona[] pp = {p1, p2, p3};
		
		ConjuntoPersonas cp = new ConjuntoPersonas(pp);
		
		
	}

}
