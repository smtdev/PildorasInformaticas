package com.frenetyklok.avanzado.tema4;

import com.frenetyklok.avanzado.tema3.EntradaConsola;

public class CalculaDNI {
	
	public static void main(String[] args){
		
		EntradaConsola entrada = new EntradaConsola("Introduce los números de tu DNI:");
		System.out.println(entrada.getMensajeTexto());
		int numeroDNI = Integer.parseInt(entrada.getEntradaTextoConsola());
		
		
		String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
				"H", "L", "C", "K", "E"};
		
		System.out.println("Tu letra es: " + letras[(numeroDNI%23)]);
		
	}

}
