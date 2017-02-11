package com.frenetyklok.aprenderaprogramar.video95;

import java.util.Calendar;

public class ProfesorInterino extends Profesor {
	
	private Calendar fechaComienzoInterinidad;
	
	public ProfesorInterino(Calendar fechaComienzoInterinidad){
		super();
		this.fechaComienzoInterinidad = fechaComienzoInterinidad;
	}
	
	public ProfesorInterino(String nombre, String apellidos, int edad, String idProfesor, Calendar fechaComienzoInterinidad){
		super(nombre, apellidos, edad, idProfesor);
		this.fechaComienzoInterinidad = fechaComienzoInterinidad;
	}

	public Calendar getFechaComienzoInterinidad() {
		return fechaComienzoInterinidad;
	}
	
	public String toString(){
		return super.toString().concat(" Fecha comienzo interinidad: ").concat(this.fechaComienzoInterinidad.getTime().toString());
	}
	
	public float importeNomina(){
		return 30f * 35.60f;
	}

}
