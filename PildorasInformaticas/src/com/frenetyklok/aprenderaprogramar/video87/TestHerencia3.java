package com.frenetyklok.aprenderaprogramar.video87;

import java.util.Calendar;

public class TestHerencia3 {
	
	public static void main(String[] args){
		Profesor profesor1 = new Profesor("Pablo", "Diaz Mu�iz", 41);
		profesor1.setIdProfesor("RD43");
		profesor1.mostrarDatosProfesor();
		
		Calendar fecha1 = Calendar.getInstance();
		fecha1.set(2109, 10, 22); // YYYY, MM, DD
		ProfesorInterino interino1 = new ProfesorInterino("Pedro", "Mart�nez", 43, fecha1);
		System.out.println("El profesor interino se incorpor� en la fecha: " + fecha1.getTime());//no hace falta a�adir getTime().toString()
	}

}
