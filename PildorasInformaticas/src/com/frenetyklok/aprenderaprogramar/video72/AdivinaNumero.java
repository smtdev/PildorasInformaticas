package com.frenetyklok.aprenderaprogramar.video72;

import com.frenetyklok.aprenderaprogramar.video61.*;
import java.util.Random;

public class AdivinaNumero {
	
	public static void main(String[] args){
		
		Random numeroAleatorio = new Random();
		
		int valor = numeroAleatorio.nextInt(100) + 1;
		
		System.out.println("Se ha generado un n�mero aleatorio entre 1 y 100.");
		System.out.println("Podr� adivinarlo?");
		System.out.println("Pruebe...");
		
		
		EntradaDeTeclado entrada = new EntradaDeTeclado();
		
		int respuesta = Integer.parseInt(entrada.getEntrada());
		
		while(valor != respuesta){
			System.out.println("Lo siento, no ha acertado...");
			
			if(valor < respuesta){
				System.out.println("El valor buscado es m�s bajo...");
			}else{
				System.out.println("El valor buscado es m�s alto...");
			}
			
			System.out.println("Seguimos intent�ndolo!!");
			entrada.pedirEntrada();
			respuesta = Integer.parseInt(entrada.getEntrada());
		}
		
		System.out.println("Enhorabuena! Has acertado!");
	}

}
