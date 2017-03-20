package com.frenetyklok.avanzado.t25.segundaparte;

import java.util.SortedMap;
import java.util.TreeMap;


public class Persona {
	
	private int idPersona;
	private String nombre;
	private int altura;
	private SortedMap<String, String> agenda;
	
	public Persona(int idPersona, String nombre, int altura){
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
		this.agenda = new TreeMap<String, String>(); //inicialmente vacía
	}
	
	public SortedMap<String, String> getAgenda(){
		return this.agenda;
	}
	
	@Override
	public String toString(){
		return "Persona-> ID: " + this.idPersona + " Nombre: " + this.nombre + " Altura: " + this.altura +
				" Agenda: " + this.agenda.toString().replaceAll(",", "\n");
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
