package com.frenetyklok.avanzado.tema3.ejercicio1;

import com.frenetyklok.avanzado.tema3.EntradaConsola;

public class Ejercicio1 {
	
	public static void main(String[] args){
		
		int[] valores = new int[5];
		
		EntradaConsola entrada = new EntradaConsola();
		
		for(int i = 0; i < valores.length; i++){
			entrada.setMensajeTexto("Introduce posición del Array [" + i + "]");
			System.out.println(entrada.getMensajeTexto());
			valores[i] = Integer.parseInt(entrada.getEntradaTextoConsola());
		}
		
		for(int i = 0; i < valores.length; i++){
			System.out.println("valores[" + i + "] = " + valores[i] );
		}
		
		entrada.cierraEntradaConsola();
		
	}

}
