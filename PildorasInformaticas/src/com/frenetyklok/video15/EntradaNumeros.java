package com.frenetyklok.video15;

import javax.swing.JOptionPane;

public class EntradaNumeros {

	public static void main(String[] args) {
		
		// esta es la forma de que nos de el resultado con dos decimales.
		//.2 hace referencia al número de decimales.
		//double x = 10000.0;
		//System.out.printf("%1.2f", x/3); 
		
		String num1 = JOptionPane.showInputDialog("Introduce un número: ");
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raíz de " + num2 + " es ");// print no incluye salto de línea
		System.out.printf("%1.2f", Math.sqrt(num2));
		
		
		

	}

}
