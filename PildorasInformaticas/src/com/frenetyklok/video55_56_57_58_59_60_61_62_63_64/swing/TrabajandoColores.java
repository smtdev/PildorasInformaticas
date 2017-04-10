package com.frenetyklok.video55_56_57_58_59_60_61_62_63_64.swing;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConColor miMarco = new MarcoConColor();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}


class MarcoConColor extends JFrame{

	public MarcoConColor(){
		setTitle("Prueba con colores");
		setSize(400, 400);
		LaminaConColor miLamina = new LaminaConColor();
		add(miLamina);
		//miLamina.setBackground(new Color(12,233,12)); así ponemos color al fonde de la lámina
		miLamina.setBackground(SystemColor.window); // le damos el color del sistema operativo. se puede ver que es el mismo que le da a la parte de la ventana donde se pone el titulo
		
	}
	
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.setPaint(Color.lightGray);
		g2.fill(rectangulo);//EN LUGAR DE DRAW, QUE DIBUJA CONTORNOS, EL METODO FILL RELLENA AREAS
		g2.setPaint(Color.BLACK);
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.setPaint(new Color(183, 206, 129).brighter());//podemos pasar un color con el constructor RGB o cualquiera de los otros colores disponibles
		//en la anterior linea se puede aplicar varias veces seguidas brighter() o tambien darker()
		g2.fill(elipse);
	}
	
}