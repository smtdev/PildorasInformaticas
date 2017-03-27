package com.frenetyklok.video46.clasesabstractas;

public class Programa {
	
	public static void main(String[] args){
		
		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado("Pablo", 35000, 2001, 11, 20);
		lasPersonas[1] = new Alumno("Pedro", "Informática");
		
		for(Persona p: lasPersonas){
			System.out.println(p.dameDescripcion());
			System.out.println(p);
		}
		
	}

}
