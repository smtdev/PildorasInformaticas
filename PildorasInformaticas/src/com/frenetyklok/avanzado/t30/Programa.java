package com.frenetyklok.avanzado.t30;

public class Programa {
	
	public static void main(String[] args){
		try{
			System.out.println("Intentamos ejecutar el bloque de instrucciones:");
			System.out.println("Instrucci�n 1.");
			System.out.println("Instrucci�n 2.");
			System.out.println("Instrucci�n 3, etc.");
		}
		catch(Exception e){
			System.out.println("Instrucciones a ejecutar cuando se produce un error.");
		}
		finally {
			System.out.println("Instrucciones a ejecutar finalmente tanto si hay errores como si no los hay.");
		}
	}

}
