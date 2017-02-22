package com.frenetyklok.avanzado.tema8;

import java.util.Random;

public class UsoSetSeed {
	
	public static void main(String[] args){
		Random rdm = new Random();
		rdm.setSeed(123);
		System.out.println(rdm.nextDouble());
		System.out.println(rdm.nextDouble());
		System.out.println(rdm.nextDouble());
		
		rdm.setSeed(123);
		System.out.println(rdm.nextDouble());
		System.out.println(rdm.nextDouble());
		System.out.println(rdm.nextDouble());
		
		//COMO SE PUEDE VER, CON LA MISMA SEMILLA LOGRAMOS LA MISMA SECUENCIA DE NUMEROS "ALEATORIOS"
		
	}

}
