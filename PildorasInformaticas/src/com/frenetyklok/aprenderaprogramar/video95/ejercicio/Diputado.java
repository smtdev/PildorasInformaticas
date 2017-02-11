package com.frenetyklok.aprenderaprogramar.video95.ejercicio;

public class Diputado extends Legislador {
	
	private final static String CAMARA = "Congreso";
	
	public Diputado(String nombre, String apellidos, int edad, String provinciaRepresenta, String partidoPolitico) {
		super(nombre, apellidos, edad, provinciaRepresenta, partidoPolitico);
	}
	

	@Override
	public String getCamaraTrabaja() {
		
		return CAMARA;
	}

}
