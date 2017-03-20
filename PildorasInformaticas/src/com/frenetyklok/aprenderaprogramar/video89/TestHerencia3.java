package com.frenetyklok.aprenderaprogramar.video89;

import java.util.Calendar;

public class TestHerencia3 {
	
	public static void main(String[] args){
		
		Profesor profesor1 = new Profesor("Juan", "Hernández García", 33);
		
		Calendar fecha1 = Calendar.getInstance();
		fecha1.set(2019, 10, 22);
		
		ProfesorInterino interino1 = new ProfesorInterino("José Luis", "Morales Pérez", 54, fecha1);
		
		Profesor profesor73 = interino1;
		
		
		if(profesor73 instanceof ProfesorInterino){
			System.out.println("profesor73 es un objeto de tipo ProfesorInterino.");
		}
		
		if(profesor73 instanceof Profesor){
			System.out.println("profesor73 es un objeto de tipo Profesor. Es POLIMORFICO!!");
		}
		
		if(interino1 instanceof Profesor){
			System.out.println("interino1 es un objeto de tipo Profesor. Es polimórfico también!");
		}else{
			System.out.println("interino1 no apunta a un objeto de tipo Profesor.");
		}
		
		if(profesor1 instanceof ProfesorInterino){
			System.out.println("profesor1 es un objeto de tipo ProfesorInterino.");
		}else{
			System.out.println("profesor1 no es un objeto de tipo ProfesorInterino.");
		}
		
		
		/*
		 * EL PROGRAMA DARÁ UN ERROR YA QUE NO SE PUEDE HACER CASTING HACIA ABAJO SALVO
		 * EN EL CASO EN QUE SE HAYA GUARDADO UN OBJETO DE LA SUBCLASE EN UNA VARIABLE 
		 * DEL TIPO SUPERCLASE. SERÍA Profesor profesor1 = new ProfesorInterino();
		 * EN ESTE ULTIMO CASO SI QUE SE PERMITE EL CASTING
		 */
		
		//interino1 = (ProfesorInterino) profesor1;

	}

}
