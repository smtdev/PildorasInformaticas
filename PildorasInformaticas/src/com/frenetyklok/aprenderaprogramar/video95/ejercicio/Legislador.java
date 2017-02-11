package com.frenetyklok.aprenderaprogramar.video95.ejercicio;

public abstract class Legislador extends Persona {
	
	private String provinciaRepresenta;
	private String partidoPolitico;
	
	public Legislador(){
		super();
		this.provinciaRepresenta = "";
		this.partidoPolitico = "";
	}
	
	public Legislador(String nombre, String apellidos, int edad, String provinciaRepresenta, String partidoPolitico){
		super(nombre, apellidos, edad);
		this.partidoPolitico = partidoPolitico;
		this.provinciaRepresenta = provinciaRepresenta;
	}

	public String getProvinciaRepresenta() {
		return provinciaRepresenta;
	}

	public String getPartidoPolitico() {
		return partidoPolitico;
	}

	@Override
	public String toString() {
		
		return super.toString() + ". Provincia: " + this.provinciaRepresenta + ". Partido: " + this.partidoPolitico;
	}
	
	abstract public String getCamaraTrabaja();
	
}
