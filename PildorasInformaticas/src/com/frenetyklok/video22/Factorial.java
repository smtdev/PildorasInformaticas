package com.frenetyklok.video22;

import javax.swing.*;

public class Factorial {
	
	public static void main (String[] args){
		
		int resultado = 1;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero: "));
		
		for(int i = numero; i > 0; i--){
			resultado = resultado * i;
		}
		
		System.out.println("El factorial de " + numero + " es: " + resultado);
		
	}

}
