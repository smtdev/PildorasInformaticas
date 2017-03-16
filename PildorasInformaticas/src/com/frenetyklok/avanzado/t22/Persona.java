package com.frenetyklok.avanzado.t22;

public class Persona {
	
	private int idPersona;
	private String nombre;
	private int altura;
	
	public Persona(int idPersona, String nombre, int altura){
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
	}
	
	@Override
	public String toString(){
		return "Persona-> ID: " + this.idPersona + " Nombre: " + this.nombre + " Altura: " + this.altura;
	}
	
	

}
