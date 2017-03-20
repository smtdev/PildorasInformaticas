package com.frenetyklok.avanzado.t23;

import java.util.Stack;

public class PruebasStack {
	
	public static void main(String[] args){
		
		Stack<String> pila = new Stack<String>();
		pila.push("H");
		pila.push("o");
		pila.push("l");
		pila.push("a");
		
		System.out.println(pila.toString());
		System.out.println(pila.empty());
		System.out.println(pila.peek());//devuelve el último elemento introducido, o sea en top of the stack
		
		/*
		 * search devuelve la posición con respecto al top de la pila,
		 * esto es, con respecto al último elemento introducido
		 * per es 1based lo que quiere decir que se empieza a contar desde 1
		 * en contraposición a 0 based que se empieza a contar desde 0
		 * como por ejemplo se hace en los arrays
		 */
		System.out.println(pila.search("a"));
		System.out.println(pila.search("l"));
		System.out.println(pila.search("o"));
		System.out.println(pila.search("a"));
		System.out.println(pila.search("H"));
		System.out.println(pila.search("me"));//cuando no encuentra devuelve -1
		System.out.println(pila.search("a"));
		
		pila.push("!");
		System.out.println(pila.toString());
		pila.pop();
		System.out.println(pila.toString());
		
		
	}

}
