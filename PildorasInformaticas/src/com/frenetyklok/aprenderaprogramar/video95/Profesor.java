package com.frenetyklok.aprenderaprogramar.video95;

public abstract class Profesor extends Persona {
	
	private String idProfesor;
	
	public Profesor(){
		super();
		this.idProfesor = "Desconocido";
	}
	
	public Profesor(String nombre, String apellidos, int edad, String idProfesor){
		super(nombre, apellidos, edad);
		this.idProfesor = idProfesor;
	}

	public String getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	public void mostrarDatos(){
		System.out.println("Datos Profesor. Profesor de nombre: " + this.getNombre() + 
				" " + this.getApellidos() + " con Id: " + this.getIdProfesor());
	}
	
	public String toString(){
		return super.toString().concat(" Id Profesor: ").concat(this.idProfesor);
	}
	
	//public abstract float importeNomina(); EN LUGAR DE PONERSE ASÍ SE PONE COMO SE INDICA ABAJO
	
	abstract public float importeNomina();

}
