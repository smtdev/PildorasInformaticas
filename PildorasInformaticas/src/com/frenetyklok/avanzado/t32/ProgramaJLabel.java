package com.frenetyklok.avanzado.t32;

import java.awt.*;
import javax.swing.*;

/*
 * FORMULARIO
 */

public class ProgramaJLabel extends JFrame{
	
	/*
	 * CONTROLES DEL FORMULARIO
	 */
	JPanel jpanel = (JPanel) this.getContentPane();
	JLabel jlabel = new JLabel();
	JTextField jTextField = new JTextField();
	
	/*
	 * CONSTRUCTOR DEL FORMULARIO
	 */
	public ProgramaJLabel(){
		
		/*
		 * PROPIEDADES DEL CONTENEDOR
		 */
		jpanel.setLayout(null);
		jpanel.setBackground(Color.lightGray);
		
		/*
		 * PROPIEDADES DE LOS CONTROLES
		 */
		jlabel.setBounds(new Rectangle(5, 15, 220, 21));
		jlabel.setText("Introduzca su peso en Kg por favor:");
		jTextField.setBounds(new Rectangle(225,  15, 50, 21));
		
		/*
		 * ADICION DE LOS CONTROLES AL CONTENEDOR
		 */
		jpanel.add(jlabel, null);
		jpanel.add(jTextField, null);
		
		/*
		 * PROPIEDADES DEL FORMULARIO
		 */
		setSize(300, 150);
		setTitle("Form3");
		setVisible(true);
		
	}
	
	public static void main(String[] args){
		new ProgramaJLabel();
	}
	
}
