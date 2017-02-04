package com.frenetyklok.aprenderaprogramar.video82;

import com.frenetyklok.aprenderaprogramar.video82.Maderas.TipoDeMadera;

public class TestEnum2 {
	
	public static void main(String[] args){
		
		TipoDeMadera miTipoDeMadera = TipoDeMadera.CAOBA;
		
		System.out.println(miTipoDeMadera);
		
		System.out.println("Los tipos de madera posible son: ");
		
		for(TipoDeMadera tmp: miTipoDeMadera.values()){
			System.out.println(tmp.toString() + "\t");
		}
		
		System.out.println(" ");
		
		System.out.println("Probemos otra forma de hacerlo:");
		System.out.println(" ");
		
		for(TipoDeMadera tmp: TipoDeMadera.values()){
			System.out.println(tmp.toString() + "\t");
		}
		
		/*
		 * CREO QUE ESTA ULTIMA FORMA DE HACERLO ES BASTANTE MAS RAZONABLE
		 */
		
		
	}

}
