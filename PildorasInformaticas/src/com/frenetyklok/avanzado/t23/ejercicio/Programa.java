package com.frenetyklok.avanzado.t23.ejercicio;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Programa {
	
	public static void main(String[] args){
		
		String cadena = JOptionPane.showInputDialog("Introduce la cadena a valorar:");
		String vocal = JOptionPane.showInputDialog("Introduce la vocal a buscar:");
		int resultado = verificaVocales(cadena, vocal);
		switch (resultado) {
		case 1:
			System.out.println("La cadena tiene un número par de vocales " + vocal);
			break;
		case -1:
			System.out.println("La cadena tiene un número impar de vocales " + vocal);
			break;
		case 0:
			System.out.println("La cadena no tiene vocales " + vocal);
			break;
		}
		
	}
	
	public static int verificaVocales(String cadena, String vocal){
		
		Stack<String> pila = new Stack<String>();
		
		int i = 0;
		boolean existe = false;
		
		while(i < cadena.length()){
			if(String.valueOf(cadena.charAt(i)).equals(vocal)){//OJO, ESTAMOS COMPARANDO OBJETOS NO TIPOS PRIMITIVOS NO SE PUEDE PONER ==
				if(pila.empty()){ pila.push(vocal); existe = true;}
				else { pila.pop();}
			}
			i++;
		}
		
		if(existe){
			if(pila.empty()){ return 1;}// hay un número par de vocales;
			else{ return -1;}
		}else{
			return 0;
		}
		
	}

}
