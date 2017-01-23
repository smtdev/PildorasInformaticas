package com.frenetyklok.aprenderaprogramar.video70;
import javax.swing.JOptionPane;

public class ejemplo1 {
	
	public static void main(String[] args){
		String entradaUsuario = JOptionPane.showInputDialog("Introduzca un número");
		int valor = Integer.valueOf(entradaUsuario);// el valor de entradaUsuario se transforma en Integer
		//Integer en vez de int en valor también funciona. Hay conversiones automáticas
		System.out.println("El doble del número introducido es: " + (2 * valor));
	}

}
