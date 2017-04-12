package com.frenetyklok.video65to73.eventos;

import java.awt.event.*;

import javax.swing.*;

public class EventosRaton72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton miMarco = new MarcoRaton();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton extends JFrame{
	public MarcoRaton(){
		setTitle("Eventos de ratón");
		setBounds(500, 300, 300, 300);
		setVisible(true);
		
		EventoRaton miEventoRaton = new EventoRaton();
		addMouseListener(miEventoRaton);
	}
}

class EventoRaton implements MouseListener{//se puede extends MouseAdapter para no tener que escribir todos los metodos de la interfaz MouseListener
	
	static int numeroClicks = 0;//podemos hacerlo así o con el método que cuenta el número de clicks

	@Override
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Has hecho click!");
		numeroClicks++;
		System.out.println("Has hecho click " + numeroClicks + " veces!");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Has entrado con el ratón en el Frame!");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Has salido del Frame con el ratón!");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Acabas de presionar un botón del ratón!");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Acabas de soltar un botón del ratón!");
		
	}
	
	
	
}
