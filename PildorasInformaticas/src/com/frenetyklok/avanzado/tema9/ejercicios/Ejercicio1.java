package com.frenetyklok.avanzado.tema9.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args){
		
		Random rdm = new Random();
		Scanner escaner = new Scanner(System.in);
		String seguimos = "";
		String apuesta = "";
		
		while(seguimos.equals("")){
			int a = rdm.nextInt(10) + 1;
			int b = rdm.nextInt(10) + 1;
			
			while(a == b){
				b = rdm.nextInt(10) + 1;
			}
			
			System.out.println("Apuestas por A o por B?");
			while(!apuesta.equals("A") && !apuesta.equals("a") && !apuesta.equals("B") && !apuesta.equals("b")){
				apuesta = escaner.nextLine();
			}
			System.out.println("A saca un: " + a + " y B saca un: " + b);
			
			if ((a > b) && (apuesta.equals("A") || apuesta.equals("a"))){
				System.out.println("Has ganado!");
			}else if((a < b) && (apuesta.equals("A") || apuesta.equals("a"))){
				System.out.println("Has perdido!");
			}else if((a > b) && (apuesta.equals("B") || apuesta.equals("b"))){
				System.out.println("Has perdido!");
			}else if((a < b) && (apuesta.equals("B") || apuesta.equals("b"))){
				System.out.println("Has ganado!");
			}
			
			System.out.println("Quieres continuar (s-n)?");
			seguimos = escaner.nextLine();
			
			while(!seguimos.equals("N") && !seguimos.equals("n") && !seguimos.equals("S") && !seguimos.equals("s")){
				System.out.println("Respuesta no válida.");
				System.out.println("Quieres continuar (s-n)?");
				seguimos = escaner.nextLine();
			}
			
			if(seguimos.equals("S") || seguimos.equals("s")){
				System.out.println("Bien! Continuamos!");
				seguimos = "";
				apuesta = "";
			}
			
		}
		System.out.println("Salimos del juego.");
		escaner.close();
		
	}

}
