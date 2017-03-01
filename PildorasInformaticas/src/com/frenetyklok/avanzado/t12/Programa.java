package com.frenetyklok.avanzado.t12;

public class Programa {
	
	public static void main(String[] args){
		Persona p = new Persona(123123, 35);
		Persona p2 = p.clone();
		p.dni = 456456;
		System.out.println(p.dni + " " + p.edad);
		System.out.println(p2.dni + " " + p2.edad);
	}

}
