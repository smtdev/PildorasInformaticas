package com.frenetyklok.video65to71.eventos;

import java.awt.*;
import javax.swing.*;

//paquete para todas las clases que incorporan enventso
import java.awt.event.*;

public class EventosVentana68_69 {
	
	public static void main(String[] args){
		
		MarcoVentana miMarco = new MarcoVentana("Ventana Exit", JFrame.EXIT_ON_CLOSE);

		MarcoVentana miMarco2 = new MarcoVentana("Ventana Dispose", JFrame.DISPOSE_ON_CLOSE);

		
		
	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana(String s, int operation){
		setTitle(s);
		setBounds(300, 300, 500, 350);
		setDefaultCloseOperation(operation);
		setVisible(true);
		
		MVentana2 oyenteVentana = new MVentana2();//creamos la instancia de la clase oyente. ver como funciona con las dos clases, MVentana y MVentana2
		addWindowListener(oyenteVentana);
		
		//las dos lineas anteriores se pueden hacer en un solo paso
		addWindowListener(new MVentana2());//si no se borra un Listener tendremos los efectos de los eventos duplicados
	}
}

class MVentana implements WindowListener{
	
	//ahora tenemos que declarar los 7 métodos de la interfaz WindowListener


	public void windowActivated(WindowEvent arg0) {
		System.out.println("Ventana activada!");
	}

	//si el marco es ExitOnClose no podemos ver el mensaje  ya que el programa se cierra si solo hay una ventana. Por lo tanto necesitamos más marcos para poder ver su efecto
	public void windowClosed(WindowEvent arg0) {
		System.out.println("Ventana Cerrada!!!!!");
	}


	public void windowClosing(WindowEvent arg0) {
		System.out.println("Este evento salta cuando la ventana se está cerrando!");
	}


	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("Ventana desactivada!");
	}


	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("Ventana maximizada, fuera del icono en la barra de herramientas!");
	}

	//este es el metodo que refiere a la minimización de la ventana
	public void windowIconified(WindowEvent arg0) {
		System.out.println("Ventana minimizada, al incono de barra de herramientas!");
	}


	public void windowOpened(WindowEvent arg0) {
		System.out.println("Ventana abierta!");
	}
	
}

/*
 * EXISTE UNA SOLUCIÓN PARA NO TENER QUE IMPLEMENTAR TODOS LOS METODOS DE LA CLASE WINDOWLISTENER
 * SI ES QUE NO LOS VAMOS A UTILIZAR. SON LAS LLAMADAS CLASES ADAPTADORAS (ADAPTER CLASSES). VEAMOS UN EJEMPLO
 * COMO ESTAS CLASES IMPLEMENTAN UNA SERIE DE INTERFACES QUE SON LAS QUE NOS INTERESAN YA SOLO TENDREMOS QUE SOBREESCRIBIR EL 
 * METODO QUE VAYAMOS A USAR.
 * POR EJEMPLO, EN EL CASO QUE NOS OCUPA USAMOS LA CLASE WINDOWADAPTER QUE IMPLEMENTA
 *     WindowFocusListener, WindowListener, WindowStateListener (detecta cualquier cambio en la ventana), EventListener
 * CON LO QUE YA NO TENDREMOS QUE ESCRIBIR TODOS LOS METODOS DE WINDOWLISTENER Y SOLO LOS QUE NECESITEMOS 
 * LOS TENDREMOS QUE ESCRIBIR
 */

class MVentana2 extends WindowAdapter{

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("La ventana se minimiza en un icono");
	}
	
	
	
}


