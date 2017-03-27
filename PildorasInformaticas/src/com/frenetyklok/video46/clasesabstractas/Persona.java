package com.frenetyklok.video46.clasesabstractas;

public abstract class Persona {
	
	private String nombre;
	
	public Persona(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
	//en realidad esta funcionalidad siguiente ya nos la da toString pero lo haremos para comprobar el tema de abstractos
	
	public abstract String dameDescripcion();

}
