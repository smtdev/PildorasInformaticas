package com.frenetyklok.aprenderaprogramar.video95;

import java.util.Calendar;

public class TestAbstract {
	
	public static void main(String[] args){
		
		Calendar fecha1 = Calendar.getInstance();
		fecha1.set(2019, 10, 22);
		
		ProfesorInterino pInterino1 = new ProfesorInterino("José", "Hernández López", 45, "98798798J", fecha1);
		ProfesorInterino pInterino2 = new ProfesorInterino("Andrés", "Moltó Parra", 87, "87888798P", fecha1);
		ProfesorInterino pInterino3 = new ProfesorInterino("José", "Ríos Mesa", 25, "25798798Z", fecha1);
		
		ProfesorTitular pTitular1 = new ProfesorTitular("Juan", "Pérez Pérez", 33, "73-K");
		ProfesorTitular pTitular2 = new ProfesorTitular("Alberto", "Centa Mota", 49, "88-L");
		ProfesorTitular pTitular3 = new ProfesorTitular("Alberto", "Centa Mota", 49, "81-F");
		
		ListinProfesores listinProfesorado = new ListinProfesores();
		
		listinProfesorado.addProfesor(pInterino1);
		listinProfesorado.addProfesor(pInterino2);
		listinProfesorado.addProfesor(pInterino3);
		listinProfesorado.addProfesor(pTitular1);
		listinProfesorado.addProfesor(pTitular2);
		listinProfesorado.addProfesor(pTitular3);
		
		listinProfesorado.imprimirListin();
		
		System.out.println("El importe total de las nóminas es: " + listinProfesorado.importeTotalNominaProfesorado() +
				" euros.");
		
	}

}
