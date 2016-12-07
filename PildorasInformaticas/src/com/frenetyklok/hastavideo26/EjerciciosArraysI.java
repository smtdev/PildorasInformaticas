package com.frenetyklok.hastavideo26;

import javax.swing.JOptionPane;

public class EjerciciosArraysI {
	
	public static void main(String[] args){
		
		
		//crear un array que contenga los números del 1 al 100
		
		int[] numeros = new int[100];
		
		for(int i = 0; i < 100; i++){
			numeros[i] = i + 1;
		}
		
		int sumaArray = 0;
		
		for(int i = 0; i < numeros.length; i++){
			sumaArray = sumaArray + numeros[i];
		}
		
		System.out.println(sumaArray);
		
		//la media es el valor anterior partido por 2.
		
		System.out.println();
		//crea un array de longitud que determine el usuario y que inserte números entre 0 y 10
		
		int longitudArray = Integer.parseInt(JOptionPane.showInputDialog("Inserte longitud array:"));
		
		int[] arrayUsuario = new int[longitudArray];
		
		for(int i = 0; i < arrayUsuario.length; i++){
			
			int valorCandidato = Integer.parseInt(JOptionPane.showInputDialog("introduce valor entre 0 y 10 para la posición " + i));
			while(valorCandidato < 0 || valorCandidato > 10){
				valorCandidato = Integer.parseInt(JOptionPane.showInputDialog("introduce valor entre 0 y 10 para la posición " + i));
			}
			
			arrayUsuario[i] = valorCandidato;
			
		}
		
		for(int i = 0; i < arrayUsuario.length; i ++){
			System.out.println(arrayUsuario[i]);
		}
		
	}

}
