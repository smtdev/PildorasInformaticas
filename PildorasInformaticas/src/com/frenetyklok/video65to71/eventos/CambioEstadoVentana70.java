package com.frenetyklok.video65to71.eventos;

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.*;

public class CambioEstadoVentana70 {

	public static void main(String[] args) {

		MarcoEstado miMarco = new MarcoEstado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado(){
		setBounds(300, 300, 500, 350);
		setVisible(true);
		
		CambiaEstado nuevoEstado = new CambiaEstado();
		addWindowStateListener(nuevoEstado);//ahora el método es diferente de los casos anteriores. 
	}
}

class CambiaEstado implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e){
		System.out.println("La ventana ha cambiado de estado!");
		
		System.out.println("El nuevo estado es: " + e.getNewState());//el método nos va informando del nuevo estado. Ver constantes de clase Frame
		System.out.println("El antiguo estado es: " + e.getOldState());
		
		//COMO HACEMOS PARA IMPRIMIR UN MENSAJE CUANDO LA PANTALLA ESTÉ A TAMAÑO COMPLETO??
		
		if(e.getNewState() == Frame.MAXIMIZED_BOTH){//6 es el estado a pantalla completa que se corresponde con MAXIMIZED_BOTH
			System.out.println("La ventana está a tamaño completo!");
		}
		
		/*
		 * CON VARIOS ELSE IF PODEMOS SEGUIR CONTROLANDO LOS ESTADOS POR LOS QUE VA PASANDO
		 */
		
	}
	
}
