package com.frenetyklok.aprenderaprogramar.video70;
import javax.swing.JOptionPane;

public class ejemplo1 {
	
	public static void main(String[] args){
		String entradaUsuario = JOptionPane.showInputDialog("Introduzca un n�mero");
		int valor = Integer.valueOf(entradaUsuario);// el valor de entradaUsuario se transforma en Integer
		//Integer en vez de int en valor tambi�n funciona. Hay conversiones autom�ticas
		System.out.println("El doble del n�mero introducido es: " + (2 * valor));
	}

}
