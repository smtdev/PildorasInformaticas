package com.frenetyklok.avanzado.tema3;

public class ParametrosDeEntrada {

	public static void main(String[] args) {
		System.out.println("Cantidad de parámetros: " + args.length);
		
		
		/*
		 * LOS PARAMETROS SE PASAN DESDE RUN --> CONFIGURATIONS --> ARGUMENTS --> PROGRAM ARGUMENTS
		 */
		
		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
		

	}

}
