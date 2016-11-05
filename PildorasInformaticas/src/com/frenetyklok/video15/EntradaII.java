package com.frenetyklok.video15;

import javax.swing.JOptionPane;// para poder utilizar la clase más adelante

public class EntradaII {

	public static void main(String[] args) {
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre: ");
		
		//int edad = JOptionPane.showInputDialog("Introduce tu edad:  "); // el método devuelve String
		
		//String edad = JOptionPane.showInputDialog("Introduce edad; ");
		//System.out.println("Hola " + nombreUsuario + " el año que viene tendrás " + (edad+1));//181 años!!
		
		//pero si queremos que edad sea un int para no tener problemas al sumarle años
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
		edad++;
		System.out.println("Hola " + nombreUsuario + " el año que viene tendrás " + edad + " años");
		
		

	}

}
