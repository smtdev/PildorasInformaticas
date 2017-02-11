package com.frenetyklok.aprenderaprogramar.video95;

public class ProfesorTitular extends Profesor {
	
	public ProfesorTitular(String nombre, String apellidos, int edad, String idProfesor){
		super(nombre, apellidos, edad, idProfesor);
	}

	@Override
	public float importeNomina() {
		
		return 30f * 43.20f;
	}

}
