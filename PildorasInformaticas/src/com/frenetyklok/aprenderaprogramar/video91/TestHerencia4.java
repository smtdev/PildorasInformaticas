package com.frenetyklok.aprenderaprogramar.video91;

import java.util.Calendar;

public class TestHerencia4 {
	
	public static void main(String[] args){
		
		Profesor profesor1 = new Profesor("Juan", "García", 33);
		profesor1.setIdProfesor("Prof12");
		
		Calendar fecha1 = Calendar.getInstance();
		fecha1.set(2017, 10, 12);
		
		ProfesorInterino interino1 = new ProfesorInterino("Luis", "Morales", 54, fecha1);
		
		ListinProfesores listin1 = new ListinProfesores();
		listin1.addProfesor(profesor1);
		listin1.addProfesor(interino1);
		
		listin1.listar();
		
		Profesor profesor2 = new ProfesorInterino("Pablo", "Perez", 34, fecha1);
		profesor2.mostrarDatos();
		
	}

}
