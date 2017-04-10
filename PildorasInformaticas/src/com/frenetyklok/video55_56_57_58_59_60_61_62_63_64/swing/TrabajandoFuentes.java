package com.frenetyklok.video55_56_57_58_59_60_61_62_63_64.swing;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class TrabajandoFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConFuentes miMarco = new MarcoConFuentes();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes(){
		setSize(400, 400);
		setTitle("Marco con fuentes");
		
		LaminaConFuentes miLamina = new LaminaConFuentes();
		miLamina.setBackground(Color.BLACK);
		add(miLamina);
		
		miLamina.setForeground(Color.BLUE);//nos pasa el color de todo lo que hemos dibujado , que era naranja a uno nuevo
		//para que funcione lo que está en esta última linea hay que eliminar todos los setColor() de la lamina
		//en caso de que haya setColor en el paintComponent de la lamina prevalecera sobre setForeground
		
	}
	
}


class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics g2 = (Graphics) g;
		
		/*
		 * ALMACENAREMOS TODOS LOS TIPOS DE LETRAS EN UN ARRAY DE TIPO
		 * STRING. PARA ELLO UTILIZAREMOS LA CLASE GRAPHICSENVIRONMENT
		 * QUE ESTA EN EL PAQUETE JAVA.AWT 
		 * Y LOS METODOS GETLOCALGRAPHICSENVIRONMENT CON EL QUE TENDREMOS 
		 * EL ENTORNO GRAFICO LOCAL Y EL METODO GETAVAILABLEFONTFAMILYNAMES
		 * QUE NOS DEVOLVERA LO QUE ESTMOS BUSCANDO
		 */
		
		String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		Font miFuente = new Font("Consolas", Font.ITALIC, 18);
		g2.setFont(miFuente);
		g2.setColor(Color.ORANGE);
		g2.drawString("Este es un texto de tamaño 18", 50, 100);
		
		g2.setFont(new Font("Arial", Font.BOLD, 14));
		g2.drawString("Este es una tamaño 14 Arial", 50, 200);//podríamos haber cambiado el color antes de esta línea
		
		
	}
	
}