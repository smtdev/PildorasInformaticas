package com.frenetyklok.avanzado.tema3.ejercicio1;

import com.frenetyklok.avanzado.tema3.EntradaConsola;

public class Ejercicio2 {
	
	public static void main(String[] args){
		double[] notas = new double[2];
		String[] alumnos =  new String[2];
		String[] calificaciones = {"Sobresaliente", "Notable", "Bien", "Suspenso"};
		
		
		EntradaConsola entrada = new EntradaConsola();
		
		for(int i = 0; i < notas.length; i++){
			entrada.setMensajeTexto("Introduce el nombre del alumno [" + i + "]");
			System.out.println(entrada.getMensajeTexto());
			alumnos[i] = entrada.getEntradaTextoConsola();
			entrada.setMensajeTexto("Introduce la nota del alumno [" + i + "]");
			System.out.println(entrada.getMensajeTexto());
			notas[i] = Double.parseDouble(entrada.getEntradaTextoConsola());
		}
		
		for(int i = 0; i < notas.length; i++){
			System.out.println(alumnos[i] + " tiene una nota de: " + notas[i]);
			if(notas[i] <= 4.99){
				System.out.println(calificaciones[3]);
			}else if(notas[i] <= 6.99){
				System.out.println(calificaciones[2]);
			}else if(notas[i] <= 8.00){
				System.out.println(calificaciones[1]);
			}else {
				System.out.println(calificaciones[0]);
			}
		}
		
		entrada.cierraEntradaConsola();
	}

}
