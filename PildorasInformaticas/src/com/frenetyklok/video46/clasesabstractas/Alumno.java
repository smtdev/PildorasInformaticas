package com.frenetyklok.video46.clasesabstractas;

public class Alumno extends Persona {
	
	private String titulacion;
	
	public Alumno(String nombre, String titulacion){
		super(nombre);
		this.titulacion = titulacion;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	@Override
	public String toString() {
		
		return super.toString() + " Titulación: " + this.titulacion;
	}

	@Override
	public String dameDescripcion() {
		
		return "Nombre: " + this.getNombre() + " Titulación: " + this.titulacion;
	}

	
	

}
