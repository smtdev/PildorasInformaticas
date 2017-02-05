package com.frenetyklok.aprenderaprogramar.video87;

import java.util.Calendar;

public class ProfesorInterino extends Profesor {
	
	private Calendar fechaComienzoInterinidad;
	
	public ProfesorInterino(String nombre, String apellidos, int edad, Calendar fechaComienzoInterinidad){
		super(nombre, apellidos, edad);
		this.fechaComienzoInterinidad = fechaComienzoInterinidad;	
	}
	
	//public Calendar getFechaComienzoInterinidad(){ return this.fechaComienzoInterinidad;}
	public String getFechaComienzoInterinidad(){ return this.fechaComienzoInterinidad.toString();}

}
