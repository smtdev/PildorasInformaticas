package com.frenetyklok.hastavideo26;

import javax.swing.JOptionPane;

public class EjerciciosFuncionesII {
	
	//crear una funci�n que nos indique si un n�mero es primo o no
	
	public static boolean esPrimo(int a){
		
		for(int i = 2; i < a; i++){
			if((a % i) == 0){
				
				return false;
			}
					
		}
		return true;
	}
	
	public static void main(String[] args){
		 
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero: "));
		boolean resultado = esPrimo(numero);
		if(resultado){
			System.out.println("El n�mero es primo!");
		}else{
			System.out.println("El n�mero no es primo!");
		}
	}

}
