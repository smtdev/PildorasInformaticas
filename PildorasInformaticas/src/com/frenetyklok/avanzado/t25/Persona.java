package com.frenetyklok.avanzado.t25;


public class Persona implements Comparable<Persona> {
	
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
	
	@Override
	public int compareTo(Persona o){
		return this.idPersona - o.idPersona;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == null){return false;}
		if(this.getClass() != o.getClass()){return false;}
		final Persona other = (Persona) o;
		if(this.idPersona != other.idPersona){ return false;}
		return true;
	}

}
