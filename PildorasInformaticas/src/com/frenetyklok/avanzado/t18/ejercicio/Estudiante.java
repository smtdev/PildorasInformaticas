package com.frenetyklok.avanzado.t18.ejercicio;

public class Estudiante implements Comparable<Estudiante> {
	
	private String nombre;
	private int edad;
	private int curso;
	
	public Estudiante(String nombre, int edad, int curso){
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}
	
	@Override
	public String toString(){
		return "Nombre: " + this.nombre + ". Edad: " + this.edad + ". Curso: " + this.curso;
	}
	
	@Override
	public int compareTo(Estudiante e){
		return this.nombre.compareTo(e.nombre);
	}
	
	public String getNombre() { return this.nombre;}
	public int getEdad() { return this.edad;}
	public int getCurso() { return this.curso;}

}
