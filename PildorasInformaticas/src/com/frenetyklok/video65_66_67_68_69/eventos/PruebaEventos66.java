package com.frenetyklok.video65_66_67_68_69.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones(){
		setTitle("Botones y eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotones miLamina = new LaminaBotones();
		add(miLamina);
	}
	
}

class LaminaBotones extends JPanel implements ActionListener{
	
	JButton botonAzul = new JButton("Azul");
	JButton botonRojo = new JButton("Rojo");
	JButton botonAmarillo = new JButton("Amarillo");
	
	public LaminaBotones(){
		add(botonAzul);
		add(botonRojo);
		add(botonAmarillo);
		botonAzul.addActionListener(this); //si this no implementa la interfaz ActionListener tendremos un error
		botonRojo.addActionListener(this);
		botonAmarillo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		
		/*
		 * para capturar el origen del evento, en el caso, como el que nos ocupa hay mas de una fuente sobre el mismo oyente
		 * utilizamos el metodo que hereda la clase ActionEvent de la clase EventObject que es el metodo getSource. Este método nos permiete identificar la fuente
		 */
		//setBackground(Color.BLUE); si solo ponemos esto no diferenciamos la fuente
		
		Object botonPulsado = e.getSource();
		
		if(botonPulsado == botonAzul) setBackground(Color.BLUE);//usamos == porque deben ser el mismo objeto, no objetos iguales. con equals tendremos si son objetos iguales pero no necesariamente el mismo objeto. Por ejemplo podemoes tener dos objetos perosna con los mismos datos pero que == daría false ya que son dos peronsas diferenetes. en cambio equals daría true ya que los valores son iguales. 
		else if(botonPulsado == botonRojo) setBackground(Color.RED);
		else if(botonPulsado == botonAmarillo){
			setBackground(Color.YELLOW);
			System.out.println("Este es el color amarillo!!");//tontería para ver que funciona
		}
	}
	
}


