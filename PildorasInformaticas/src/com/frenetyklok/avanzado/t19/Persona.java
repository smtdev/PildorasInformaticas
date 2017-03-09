package com.frenetyklok.avanzado.t19;

public class Persona {
	
	private int idPersona;
	private String nombre;
	private int altura;
	
	public Persona(int idPersona, String nombre, int altura){
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
	}
	
	public int getAltura() { return this.altura;}
	public String getNombre() { return this.nombre;}
	public int getIdPersona() { return this.idPersona;}
	
	@Override
	public String toString(){
		return "Id: " + this.getIdPersona() + ". Nombre: " + this.getNombre() + ". Altura: " + this.getAltura();
	}

}
