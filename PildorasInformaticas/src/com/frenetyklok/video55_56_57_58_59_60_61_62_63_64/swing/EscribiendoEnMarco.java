package com.frenetyklok.video55_56_57_58_59_60_61_62_63_64.swing;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTexto miMarco = new MarcoConTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto(){
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer texto");
		
		//incluimos la lámina
		Lamina miLamina = new Lamina();
		add(miLamina);
		
	}
	
}

class Lamina extends JPanel{
	
	/*
	 * SOBREESCRIBIMOS EL METODO PAINTCOMPONENT QUE HEREDA LA CLASE JPANEL
	 * PARA PINTAR LO QUE NOSOTROS QUERAMOS
	 */

	@Override
	protected void paintComponent(Graphics g) {
		//debe seguir haciendo el trabajo que tiene en la clas JPanel (definida en JComponent) así escribimos la siguiente linea
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo Swing", 100, 50);
		
	}
	
}
