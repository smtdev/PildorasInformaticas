package com.frenetyklok.video65to71.eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos67 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones2 miMarco = new MarcoBotones2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}

class MarcoBotones2 extends JFrame{
	
	public MarcoBotones2(){
		setTitle("Botones y eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotones2 miLamina = new LaminaBotones2();
		add(miLamina);
	}
	
}

class LaminaBotones2 extends JPanel{
	
	JButton botonAzul = new JButton("Azul");
	JButton botonRojo = new JButton("Rojo");
	JButton botonAmarillo = new JButton("Amarillo");
	
	public LaminaBotones2(){
		add(botonAzul);
		add(botonRojo);
		add(botonAmarillo);
		
		ColorFondo amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo rojo = new ColorFondo(Color.RED);
		ColorFondo azul = new ColorFondo(Color.BLUE);
		
		botonAzul.addActionListener(azul); 
		botonRojo.addActionListener(rojo);
		botonAmarillo.addActionListener(amarillo);
	}
	
	private class ColorFondo implements ActionListener{
		
		private Color colorDeFondo; 
		
		public ColorFondo(Color c){
			colorDeFondo = c;
		}
		
		public void actionPerformed(ActionEvent e){
			setBackground(colorDeFondo);
		}
		
	}
	

}








