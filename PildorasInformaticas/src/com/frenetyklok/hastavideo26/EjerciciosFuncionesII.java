package com.frenetyklok.hastavideo26;

import javax.swing.JOptionPane;

public class EjerciciosFuncionesII {
	
	//crear una función que nos indique si un número es primo o no
	
	public static boolean esPrimo(int a){
		
		for(int i = 2; i < a; i++){
			if((a % i) == 0){
				
				return false;
			}
					
		}
		return true;
	}
	
	public static void main(String[] args){
		 
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
		boolean resultado = esPrimo(numero);
		if(resultado){
			System.out.println("El número es primo!");
		}else{
			System.out.println("El número no es primo!");
		}
	}

}
