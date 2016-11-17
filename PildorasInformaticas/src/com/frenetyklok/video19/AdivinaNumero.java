package com.frenetyklok.video19;

import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		int aleatorio = (int)(Math.random()*100 + 1); //para que el n�mero est� entre 1 y 100
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		
		while(numero != aleatorio){
			
			intentos++;
			System.out.println("Introduce un n�mero por favor:");
			numero = entrada.nextInt();
			
			if(aleatorio < numero){
				System.out.println("Mas bajo...");
			}
			
			else if(aleatorio > numero){
				System.out.println("Mas alto...");
			}
			
			
		}
		
		System.out.println("Correcto! en " + intentos + " intentos!");

	}

}
