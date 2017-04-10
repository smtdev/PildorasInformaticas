package com.frenetyklok.video55_56_57_58_59_60_61_62_63_64.swing;

import java.awt.Dimension;import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class MarcoCentroPantalla {

	public static void main(String[] args) {
		
		MiMarcoCentrado mimarco = new MiMarcoCentrado();
		mimarco.setVisible(true);

	}

}


class MiMarcoCentrado extends JFrame{
	
	public MiMarcoCentrado(){
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();// almacenamos en miPantalla nuestro sistema de ventanas
		Dimension resolucionPantalla = miPantalla.getScreenSize();//obtenemos la resolución de la pantalla nos devuelve un Dimension
		
		int alturaPantalla = resolucionPantalla.height;
		int anchoPantalla = resolucionPantalla.width;
		
		//queremos una ventana de 500 x 400 en el centro de la pantalla
		//el centro de la pantalla está en anchoPantalla/2 y alturaPantalla/2
		
		//setExtendedState(Frame.MAXIMIZED_BOTH); para indicar como carga el Frame que hemos creado, en este caso amplia al máximo la ventana
		
		setBounds((anchoPantalla/2) - (500/2), (alturaPantalla/2) - (400/2), 500, 400);//ahora tenemos la ventana en el centro de la pantalla
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ventana en el centro del monitor");
		
		Image miIcono = miPantalla.getImage("E:/Curso Java/logotipo.jpg");//se puede usar / o \\ y rutas relativas y absolutas
		setIconImage(miIcono);
		
		
	}
	
}