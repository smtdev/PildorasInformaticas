package com.frenetyklok.video15;

import javax.swing.JOptionPane;// para poder utilizar la clase m�s adelante

public class EntradaII {

	public static void main(String[] args) {
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre: ");
		
		//int edad = JOptionPane.showInputDialog("Introduce tu edad:  "); // el m�todo devuelve String
		
		//String edad = JOptionPane.showInputDialog("Introduce edad; ");
		//System.out.println("Hola " + nombreUsuario + " el a�o que viene tendr�s " + (edad+1));//181 a�os!!
		
		//pero si queremos que edad sea un int para no tener problemas al sumarle a�os
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
		edad++;
		System.out.println("Hola " + nombreUsuario + " el a�o que viene tendr�s " + edad + " a�os");
		
		

	}

}
