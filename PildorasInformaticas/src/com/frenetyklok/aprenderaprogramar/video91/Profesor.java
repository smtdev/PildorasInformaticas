package com.frenetyklok.aprenderaprogramar.video91;

public class Profesor extends Persona {
	
	private String idProfesor;
	
	public Profesor(){
		super();
		this.idProfesor = "Desconocida";
	}
	
	public Profesor(String nombre, String apellidos, int edad){
		super(nombre, apellidos, edad);
		this.idProfesor = "Desconocido";
	}
	
	public void setIdProfesor(String idProfesor){
		this.idProfesor = idProfesor;
	}
	
	public String getIdProfesor(){
		return this.idProfesor;
	}
	
	public void mostrarDatos(){
		System.out.println("Nombre: " + this.getNombre() + ".");
		System.out.println("Apellidos: " + this.getApellidos() + ".");
		System.out.println("Edad: " + this.getEdad() + " años.");
	}
	
	
	
	

}
