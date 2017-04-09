package com.frenetyklok.video55_56_57_58_59_60.swing;

import javax.swing.*;
import java.awt.*;


public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos miMarco = new MarcoConDibujos();
		miMarco.setVisible(true);

	}

}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos(){
		setTitle("Prueba de dibujo");
		setSize(400, 400);//OJO, LAS MEDIDAS DEL MARCO INCLUYEN LA PARTE EN LA QUE ESTÁ EL TITULO DEL FRAME
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaConFiguras miLamina = new LaminaConFiguras();
		add(miLamina);
	}
	
}

class LaminaConFiguras extends JPanel{

	@Override
	protected void paintComponent(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paintComponent(arg0);
		
		//método para pintar un rectángulo en una determinada posicion(posicion primero y luego ancho y alto)
		arg0.drawRect(100, 100, 200, 50);
		
		//para dibujar una linea
		arg0.drawLine(100, 100, 300, 150);
		
		//para dibujar un arco, hay que ver qué significa cada uno de los parámetros
		//arg0.drawArc(x, y, width, height, startAngle, arcAngle);

	}

}
