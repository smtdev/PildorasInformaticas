package com.frenetyklok.avanzado.t18;

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
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", altura=" + altura + "]";
	}
	
	
	//EL SIGUIENTE METODO MARCA EL ORDEN NATURAL DE LOS OBJETOS PERSONA COMO YA HABÍAMOS VISTO
	//POR EJEMPLO ES EL ORDEN QUE SE UTILIZARA CON EL METODO COLLECTIONS.SORT(ARRAYLIST)
	@Override
	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.nombre);
	}
	
	public int getIdPersona(){ return this.idPersona;}
	public String getNombre(){ return this.nombre;}
	public int getAltura(){ return this.altura;}
	
	
	
	

}
