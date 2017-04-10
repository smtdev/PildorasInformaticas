package com.frenetyklok.video55_56_57_58_59_60_61_62_63_64.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;


public class PruebaDibujo2D {

	public static void main(String[] args) {
		MarcoConDibujo2D miMarco = new MarcoConDibujo2D();
		miMarco.setVisible(true);
	}

}



class MarcoConDibujo2D extends JFrame{
	
	public MarcoConDibujo2D(){
		setTitle("Prueba de dibujo 2D");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaConFiguras2D miLamina = new LaminaConFiguras2D();
		add(miLamina);
	}
}





class LaminaConFiguras2D extends JPanel{
	
	@Override
	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		//creamos una figura 2D
		//lo que hacemos es un casting
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 50);
		g2.draw(rectangulo);
		
		//dibujemos ahora una elipse. Su ubicacion se refiere al rectangulo en el que se inscribe
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);//establecemos el rectangulo en el que se inscribe. también podríamos poner los cuatro valores de crear un rectangulo
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100, 100, 200, 200));
		
		
		//esta es otra forma de hacer una elipse (ahora es un circulo (ver como se hace esto en la API. me refiero a que son los parámetros del metodo
		double centroX = rectangulo.getCenterX();
		double centroY = rectangulo.getCenterY();
		
		double radio = 150;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX, centroY, (centroX + radio), (centroY + radio));
		g2.draw(circulo);
	}
}























