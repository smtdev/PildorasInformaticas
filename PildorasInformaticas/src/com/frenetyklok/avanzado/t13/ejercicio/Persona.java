package com.frenetyklok.avanzado.t13.ejercicio;

public class Persona implements Comparable<Persona> {
	
	private String nombre;
	private int altura;
	private int edad;
	
	public Persona(String nombre, int altura, int edad){
		
		this.nombre = nombre;
		this.altura = altura;
		this.edad = edad;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Persona o) {
		
		int resultado = 0;
		if(this.edad < o.edad) resultado = -1;
		else if(this.edad > o.edad) resultado = 1;
		else{
			if(this.altura < o.altura) resultado = -1;
			else if(this.altura > o.altura) resultado = 1;
			else resultado = 0;
		}
		
		return resultado;
		
	}
	
	//comparador para edad solo
	public int compareToEdad(Persona o){
		int resultado = 0;
		
		if(this.edad < o.edad) resultado = -1;
		else if(this.edad > o.edad) resultado = 1;
		else resultado = 0;
		
		return resultado;
		
	}
	
	//comparador para altura solo
	public int compareToAltura(Persona o){
		int resultado = 0;
		
		if(this.altura < o.altura) resultado = -1;
		else if(this.altura > o.altura) resultado = 1;
		else resultado = 0;
		
		return resultado;
	}
	
	

}
