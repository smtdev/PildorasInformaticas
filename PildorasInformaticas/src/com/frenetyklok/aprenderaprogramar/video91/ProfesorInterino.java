package com.frenetyklok.aprenderaprogramar.video91;

import java.util.Calendar;

public class ProfesorInterino extends Profesor {
	
	private Calendar fechaInterinidad;
	
	public ProfesorInterino(Calendar fechaInterinidad){
		super();
		this.fechaInterinidad = fechaInterinidad;
	}
	
	public ProfesorInterino(String nombre, String apellidos, int edad, Calendar fechaInterinidad){
		super(nombre, apellidos, edad);
		this.fechaInterinidad = fechaInterinidad;
	}
	
	public Calendar getFechaInterinidad(){
		return this.fechaInterinidad;
	}
	
	@Override
	public void mostrarDatos(){
		super.mostrarDatos();
		System.out.println("Es INTERINO");
		System.out.println("Fecha comienzo interinidad: " + this.getFechaInterinidad().getTime().toString() + ".");
	}

}
