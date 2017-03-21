package com.frenetyklok.avanzado.t32;

import java.awt.*;
import javax.swing.*;

public class ProgramaJTextArea extends JFrame {
	
	/*
	 * CONTROLES DE FORMULARIO
	 */
	JPanel jpanel = (JPanel)this.getContentPane();
	JTextArea jTextArea = new JTextArea();
	
	/*
	 * CONSTRUCTOR DEL FORMULARIO
	 */
	
	public ProgramaJTextArea(){
		
		jpanel.setLayout(null);
		jpanel.setBackground(Color.lightGray);
		
		/*
		 * PROPIEDADES DE LOS CONTROLES
		 */
		jTextArea.setBounds(25, 15, 250, 90);
		jTextArea.setText("Esto es un control \n\r JTextArea \r\n de varias líneas");
		jTextArea.setEditable(false);
		
		/*
		 * ADICION DE LOS CONTROLES AL CONTENEDOR
		 */
		jpanel.add(jTextArea);
		
		/*
		 * PROPIEDADES DEL FORMULARIO
		 */
		setSize(300, 150);
		setTitle("Form2");
		setVisible(true);
	}
	
	public static void main(String[] args){
		new ProgramaJTextArea();
	}

}
