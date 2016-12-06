package com.frenetyklok.hastavideo26;

import javax.swing.JOptionPane;

public class EjerciciosBuclesI {

	public static void main(String[] args) {
		
		//mostrar los números del uno al diez con un while
		
		int i = 1;
		
		while(i <= 10){
			System.out.println(i + " ");
			i++;
		}
		
		System.out.println("");
		
		//ahora lo mismo pero con un bucle for
		
		for(int j = 1; j <= 10; j++){
			System.out.println(j);
		}
		
		System.out.println("");
		
		//mostrar del 1 al 100 y que sean divisibles por 2 y 3
		
		for(int k = 1; k <= 100; k++){
			if(((k%2)==0) && ((k%3)==0)){
				System.out.println(k);
			}
		}
		
		System.out.println();
		
		//realizar la suma de 1 hasta el número que indiquemos
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("insertar un número"));
		int b = 0;
		for(int g = 1; g <= a; g++){
			b += g;
			
		}
		System.out.println("La suma es igual a " + b);
		
		System.out.println("");
		//crear una aplicación que nos permita insertar números haste que insertemos un -1
		
		int d;
		do{
			d = Integer.parseInt(JOptionPane.showInputDialog("Insertar un número"));
			System.out.println(d);
		}while(d != -1);
		
		
	}

}
