package com.frenetyklok.avanzado.tema8;

import java.util.Random;

public class GeneradorAleatoriosEnteros {
	
	public static int generaEnteros(int max, int min){
		
		Random rdm = new Random();
		int resultado = (int) (rdm.nextDouble() * (max - min + 1) + min);
		return resultado;
		
	}
	
	public static void main(String[] args){
		
		System.out.println(generaEnteros(100, 1));
		
	}

}
