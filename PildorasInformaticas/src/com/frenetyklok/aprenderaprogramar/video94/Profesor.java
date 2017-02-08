package com.frenetyklok.aprenderaprogramar.video94;

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
	
	public Profesor(String nombre, String apellidos, int edad, String idProfesor){
		super(nombre, apellidos, edad);
		this.idProfesor = idProfesor;
	}
	
	public void setIdProfesor(String idProfesor){
		this.idProfesor = idProfesor;
	}
	
	public String getIdProfesor(){
		return this.idProfesor;
	}
	
	public void mostrarDatos(){
		System.out.println("Mostrando datos del profesor: ");
		System.out.println("Nombre: " + this.getNombre() + ".");
		System.out.println("Apellidos: " + this.getApellidos() + ".");
		System.out.println("Edad: " + this.getEdad() + " años.");
	}

	@Override
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Profesor){
			Profesor tmpProfesor = (Profesor) objeto;
			//super se aplica como metodo de la superclase al objeto que invoca equals en esta clase, o sea a this (aunque no se puede poenr porque da error)
			if(super.equals(tmpProfesor) && this.idProfesor.equals(tmpProfesor.idProfesor)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "Profesor [idProfesor=" + idProfesor + "]";
	}
	
	
	
	

}
