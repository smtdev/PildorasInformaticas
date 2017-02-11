package com.frenetyklok.aprenderaprogramar.video95.ejercicio;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona(){
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
	}
	
	public Persona(String nombre, String apellidos, int edad){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		//USAMOS ESTE INTEGER PARA PODER USAR CONCAT. PARA LO QUE DEBEMOS PASAR UN STRING QUE CONSEGUIMOS CON TOSTRING
		//LO PODRÍAMOS HACER SIN USAR ESTO
		Integer datoEdad = this.edad;
		return "-Nombre: ".concat(this.nombre).concat(" Apellidos: ").concat(this.apellidos).concat(" Edad: ").concat(datoEdad.toString());
	}
	
}
