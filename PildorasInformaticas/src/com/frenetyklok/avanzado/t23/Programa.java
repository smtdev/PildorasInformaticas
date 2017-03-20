package com.frenetyklok.avanzado.t23;

import java.util.Stack;

public class Programa {
	
	public static void main(String[] args){
		
		String cadenano = "(Cadena no equilibrada en par�ntesis(()))))";
		String cadenasi = "(Cadena equilibrada en par�ntesis())";
		System.out.println("Verificaci�n de par�ntesis para cadenano:");
		System.out.println(verificaParentesis(cadenano));
		System.out.println("Verificaci�n de par�ntesis para cadenasi:");
		System.out.println(verificaParentesis(cadenasi));
		
	}
	
	public static boolean verificaParentesis(String cadena){
		
		Stack<String> pila = new Stack<String>();
		int i = 0;
		
		while(i < cadena.length()){
			if(cadena.charAt(i) == '(') {
				pila.push("(");
			}
			else if(cadena.charAt(i) == ')'){
				if(!pila.empty()) { pila.pop();}
				else {
					pila.push(")");
					break;
				}
			}
			i++;
		}
		if(pila.empty()){return true;}
		else{return false;}
		
	}

}
