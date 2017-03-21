package com.frenetyklok.avanzado.t31;

import java.awt.*;
import javax.swing.*;


/*
 * FORMULARIO
 */
public class ProgramaTextField extends JFrame{
	
	/*
	 * CONTROLES DEL FORMULARIO
	 */
	JPanel jpanel = (JPanel) this.getContentPane();
	JTextField jTextField = new JTextField();
	
	/*
	 * CONSTRUCTOR DEL FORMULARIO
	 */
	
	public ProgramaTextField(){
		
		/*
		 * PROPIEDADES DEL CONTENEDOR
		 */
		jpanel.setLayout(null);
		jpanel.setBackground(Color.lightGray);
		
		/*
		 * PROPIEDADES DE LOS CONTROLES
		 */
		jTextField.setBounds(new Rectangle(25, 15, 250, 21));
		jTextField.setText("Realizada modificación del JTextField");
		jTextField.setEditable(true);
		jTextField.setHorizontalAlignment(JTextField.CENTER);
		
		/*
		 * ADICION DE LOS CONTROLES AL CONTENDOR
		 */
		jpanel.add(jTextField, null);
		
		/*
		 * PROPIEDADES DEL FORMULARIO
		 */
		setSize(500, 150);
		setTitle("Form1");
		setVisible(true);
		
	}
	
	public static void main(String[] args){
		
		new ProgramaTextField();
		//ProgramaTextField ptf = new ProgramaTextField();
		//String cadena = ptf.jTextField.getText();
		//System.out.println(cadena);
	}

}
