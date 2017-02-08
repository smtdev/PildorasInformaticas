package com.frenetyklok.aprenderaprogramar.video94;

public class TestHerencia5 {
	
	public static void main(String[] args){
		
		Profesor profesor1 = new Profesor("Juan", "Hernández", 33);
		profesor1.setIdProfesor("Prof 22-387-11");
		
		Profesor profesor2 = new Profesor("Juan", "Hernández", 33);
		profesor2.setIdProfesor("Prof 22-387-11");
		
		Profesor profesor3 = new Profesor("Juan", "Hernández", 33);
		profesor3.setIdProfesor("Prof 22-285-11");
		
		
		Persona persona1 = new Persona("José", "López", 28);
		Persona persona2 = new Persona("José", "López", 28);
		Persona persona3 = new Persona("Ramiro", "Suárez", 19);
		
		System.out.println("Son iguales persona1 y persona2?: " + persona1.equals(persona2));
		System.out.println("Son el mismo objeto persona1 y persona2?: " + (persona1 == persona2));
		System.out.println("Son iguales la persona1 y la persona3?: " + persona1.equals(persona3));
		System.out.println("Son iguales el profesor1 y el profesor2?: " + profesor1.equals(profesor2));
		System.out.println("Son iguales el profesor1 y el profesor3?: " + profesor1.equals(profesor3));
		
		System.out.println("    ******************");
		
		System.out.println();
		
		Profesor profesor4 = new Profesor("Pablo", "Hernández", 33);
		profesor4.setIdProfesor("Prof 22-285-11");
		
		Persona persona4 = profesor4;
		System.out.println(persona4);
		
		System.out.println();
		System.out.println("   *****************");
		System.out.println();
		
		Persona persona6 = new Profesor("Pedro", "Hernández", 33, "idprofesor");
		System.out.println(persona6);
		
	}

}
