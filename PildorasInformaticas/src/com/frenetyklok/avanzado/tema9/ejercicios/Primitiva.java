package com.frenetyklok.avanzado.tema9.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Primitiva {
	
	public static void main(String[] args){
		int[] combinacionJugada = new int[6];
		int[] combinacionGanadora = new int[6];
		
		Random rdm = new Random();
		Scanner escaner = new Scanner(System.in);
		
		for (int i = 0; i < combinacionJugada.length; i++){
			System.out.println("Por favor introduce posición " + (i+1) + ":");
			int tmp = Integer.parseInt(escaner.nextLine());
			for(int j = 0; j < combinacionJugada.length; j++){
				
			}
		}
	}

}
