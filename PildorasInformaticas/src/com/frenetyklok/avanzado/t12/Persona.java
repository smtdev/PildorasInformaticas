package com.frenetyklok.avanzado.t12;

public class Persona implements Cloneable{
	
	public int edad, dni;
	
	public Persona(int dni, int edad){
		this.dni = dni;
		this.edad = edad;
	}
	
	public Persona clone(){
		Persona clon = new Persona(this.dni, this.edad);
		return clon;
	}
	
}