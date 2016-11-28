package com.frenetyklok.video24;

public class UsoArraysIIb {

	public static void main(String[] args) {


		int[] matrizAleatorios = new int[150];
		
		for(int i = 0; i < matrizAleatorios.length; i ++){
			
			matrizAleatorios[i] = (int)Math.round(Math.random()*100);//ver entre qué valores estarán
		}
		
		for(int elemento : matrizAleatorios){
			System.out.print(elemento + " ");
		}

	}

}
