package com.frenetyklok.video12;

public class ManipulaCadenasII {

	public static void main(String[] args) {
		
		String frase = "Hoy es un estupendo día para aprender a programar en Java";
		
		//intentarmos extraer "aprender a programar en Java"
		
		String fraseResumen = frase.substring(29, frase.length());
		System.out.println(fraseResumen);

	}

}
