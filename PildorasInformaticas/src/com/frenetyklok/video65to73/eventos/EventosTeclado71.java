package com.frenetyklok.video65to73.eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado71 {

	public static void main(String[] args) {
		
		MarcoConTeclas miMarco = new MarcoConTeclas();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas(){
		setTitle("Eventos de teclado");
		setBounds(500, 300, 300, 300);
		setVisible(true);
		
		EventoTeclado tecla = new EventoTeclado();
		addKeyListener(tecla);
	}
	
}

class EventoTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		
		int codigo = e.getKeyCode();
		System.out.println("El tecla pulsada es: " + KeyEvent.getKeyText(codigo));
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(KeyEvent.getKeyText(e.getKeyCode()).equals("R")){//las teclas las trabaja en mayusculas. en lugar de text se puede usar char pero devuelve un char en lugar de un String
			System.out.println("La letra soltada es la R");
		}
		
		if(e.getKeyChar() == 's'){//las teclas las trabaja en minusculas. en lugar de text se puede usar char pero devuelve un char en lugar de un String
			System.out.println("La letra soltada es la S");
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}