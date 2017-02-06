package com.frenetyklok.aprenderaprogramar.video91;

import java.util.ArrayList;

public class ListinProfesores {
	
	private ArrayList<Profesor> listinProfesores;
	
	public ListinProfesores(){
		this.listinProfesores = new ArrayList<Profesor>();
	}
	
	public void addProfesor(Profesor profesor){
		listinProfesores.add(profesor);
	}
	
	public void listar(){
		System.out.println("Se procede a mostrar los datos de los profesores existentes en el listín:");
		
		for(Profesor tmpProfesor: listinProfesores){
			tmpProfesor.mostrarDatos();
			System.out.println("    *****");
		}
	}

}
