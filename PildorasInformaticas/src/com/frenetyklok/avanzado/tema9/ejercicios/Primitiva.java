package com.frenetyklok.avanzado.tema9.ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Primitiva {
	
	public static void main(String[] args){
		int[] combinacionJugada = new int[6];
		int[] combinacionGanadora = new int[6];
		
		Random rdm = new Random();
		Scanner escaner = new Scanner(System.in);
		
		/*
		 * LOS OBJETOS STRING SON INMUTABLES. CUANDO CAMBIAMOS SU VALOR LO QUE HACEMOS ES CREAR
		 * OTRO ESPACIO EN MEMORIA CON ESE VALOR AL QUE APUNTARA LA VARIABLE QUE YA HABIAMOS CREADO 
		 * QUEDANDO EL PRIMER VALOR INACCESIBLE EN MEMORIA
		 * USAMOS LA CLASE STRINGBUFFER QUE ES MUTABLE CON LO QUE POEMOS VARIAR EL CONTENIDO DEL 
		 * ESPACIO EN MEMORIA AL QUE APUNTA LA VARIABLA CON LO QUE NUESTRO PROGRAMA ES MAS EFICIENTE
		 */
		StringBuffer seguimos = new StringBuffer("");
		
		while(seguimos.toString().equals("")){
			System.out.println("Comienza el juego!");
			
			//EN PRIMER LUGAR VAMOS A GENERAR LA COMBINACIÓN GANADORA
			int numeroElementosGanadora = 0;
			int numeroElementosJugada = 0;
			boolean encontrado;
			int aleatorio;
			
			while(numeroElementosGanadora < combinacionGanadora.length){
				encontrado = false;
				aleatorio = rdm.nextInt(49) + 1;//NUMEROS ENTEROS ENTRE 1 Y 49
				for(int i = 0; i < combinacionGanadora.length && !encontrado; i++){
					if(aleatorio == combinacionGanadora[i]){
						encontrado = true;
					}
				}
				
				if(!encontrado){
					combinacionGanadora[numeroElementosGanadora++] = aleatorio;
				}
			}
			
			System.out.println("Combinación ganadora creada!");
			System.out.println("Haz tu apuesta!!");
			
			while(numeroElementosJugada < combinacionJugada.length){
				encontrado = false;
				System.out.println("Introduce el elemento [" + (numeroElementosJugada + 1) + "]: ");
				aleatorio = Integer.parseInt(escaner.nextLine());
				for(int i = 0; i < combinacionJugada.length && !encontrado; i++){
					if(aleatorio == combinacionJugada[i]){
						encontrado = true;
					}
				}
				
				if(!encontrado){
					combinacionJugada[numeroElementosJugada++] = aleatorio;
				}else {
					System.out.println("El elemento no es válido!");
				}
			}
			
			System.out.println("Mostramos los números elegidos:");
			System.out.println(Arrays.toString(combinacionJugada));
			System.out.println("Mostramos la combinación ganadora:");
			System.out.println(Arrays.toString(combinacionGanadora));
			
			//COMPROBAMOS LOS ACIERTOS
			
			int aciertos = 0;
			
			for(int i = 0; i < combinacionGanadora.length; i++){
				for(int j = 0; j < combinacionJugada.length; j++){
					if(combinacionGanadora[i] == combinacionJugada[j]){
						aciertos++;
					}
				}
			}
			
			System.out.println("Has tenido " + aciertos + " aciertos!!");
			
			System.out.println("Quieres continuar (s-n)?");
			seguimos.append(escaner.nextLine());
			
			while(!seguimos.toString().equals("N") && !seguimos.toString().equals("n") && !seguimos.toString().equals("S") && !seguimos.toString().equals("s")){
				System.out.println("Respuesta no válida.");
				seguimos.delete(0, seguimos.capacity());
				System.out.println("Quieres continuar (s-n)?");
				seguimos.append(escaner.nextLine());
			}
			
			if(seguimos.toString().equals("S") || seguimos.toString().equals("s")){
				System.out.println("Bien! Continuamos!");
				seguimos.delete(0, seguimos.capacity());
				numeroElementosGanadora = 0;
				numeroElementosJugada = 0;
				for(int i = 0; i < combinacionGanadora.length; i++){
					combinacionGanadora[i] = 0;
					combinacionJugada[i] = 0;
				}
			}
		}
		System.out.println("Salimos del juego.");
		escaner.close();	
		
	}

}
