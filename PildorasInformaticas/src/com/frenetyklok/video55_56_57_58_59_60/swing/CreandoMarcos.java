package com.frenetyklok.video55_56_57_58_59_60.swing;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {
	
	public static void main(String[] args){
		
		MiMarco marcoUno = new MiMarco();
		marcoUno.setVisible(true);//orden para que se vea el marco
	}

}


class MiMarco extends JFrame{
	
	public MiMarco(){
		//setSize(500, 300);//orden para dar tamaño al marco
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//comportamiento al cerrar el marco
		//setLocation(500, 300);//localizamos el vértice superior izquierdo del Frame
		
		setBounds(500, 300, 800, 700);//sustituye location y size en este mismo orden
		//setResizable(false);//para permitir o no redimensionar el marco. comportamiento por defecto es true
		//setExtendedState(Frame.MAXIMIZED_BOTH);//el marco se abre a pantalla completa. Este método marca el estado al arrancar
		setTitle("Mi Ventana");//para poner título a un marco
	}
	
}
