package com.frenetyklok.aprenderaprogramar.video95.ejercicio;

public class Senador extends Legislador {
	
	private final static String CAMARA = "Senado";
	
	public Senador(String nombre, String apellidos, int edad, String provinciaRepresenta, String partidoPolitico) {
		super(nombre, apellidos, edad, provinciaRepresenta, partidoPolitico);
	}

	@Override
	public String getCamaraTrabaja() {
		return CAMARA;
	}

}
