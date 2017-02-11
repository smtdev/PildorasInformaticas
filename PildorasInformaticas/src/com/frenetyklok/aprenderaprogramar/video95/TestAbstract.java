package com.frenetyklok.aprenderaprogramar.video95;

import java.util.Calendar;

public class TestAbstract {
	
	public static void main(String[] args){
		
		Calendar fecha1 = Calendar.getInstance();
		fecha1.set(2019, 10, 22);
		
		ProfesorInterino pInterino1 = new ProfesorInterino("Jos�", "Hern�ndez L�pez", 45, "98798798J", fecha1);
		ProfesorInterino pInterino2 = new ProfesorInterino("Andr�s", "Molt� Parra", 87, "87888798P", fecha1);
		ProfesorInterino pInterino3 = new ProfesorInterino("Jos�", "R�os Mesa", 25, "25798798Z", fecha1);
		
		ProfesorTitular pTitular1 = new ProfesorTitular("Juan", "P�rez P�rez", 33, "73-K");
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
		
		System.out.println("El importe total de las n�minas es: " + listinProfesorado.importeTotalNominaProfesorado() +
				" euros.");
		
	}

}
