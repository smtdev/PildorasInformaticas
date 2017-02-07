package com.frenetyklok.aprenderaprogramar.video93;

public class Profesor {
	
	protected String nombre;
	protected int edad;
	protected int anosConsolidados;
	
	public Profesor(String nombre, int edad, int anosConsolidados) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.anosConsolidados = anosConsolidados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAnosConsolidados() {
		return anosConsolidados;
	}

	public void setAnosConsolidados(int anosConsolidados) {
		this.anosConsolidados = anosConsolidados;
	}
	
	

}
