package com.frenetyklok.aprenderaprogramar.video89;

public class Profesor extends Persona {
	
	private String idProfesor;
	
	public Profesor(String nombre, String apellidos, int edad){
		super(nombre, apellidos, edad);
		idProfesor = "Desconocido";
	}
	
	public void setIdProfesor(String idProfesor){
		this.idProfesor = idProfesor;
	}
	
	public String getIdProfesor(){return this.idProfesor;}
	
	public void mostrarDatosProfesor(){
		System.out.println("Nombre del profesor: " + this.getNombre() +
				" " + this.getApellidos() + ". Id del profesor: " + this.getIdProfesor());
	}

}
