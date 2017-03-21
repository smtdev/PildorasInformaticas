package com.frenetyklok.avanzado.t33;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/*
 * FORMULARIO
 */

public class ProgramaArrayGrafico extends JFrame{
	
	/*
	 * CONTROLES DEL FORMULARIO
	 */
	JPanel jpanel = (JPanel)this.getContentPane();
	JLabel[] label = new JLabel[6];
	JTextField[] text = new JTextField[6];
	Border border = BorderFactory.createLineBorder(Color.black, 1);
	
	/*
	 * CONSTRUCTOR DEL FORMULARIO
	 */
	public ProgramaArrayGrafico(){
		
		/*
		 * PROPIEDADES DEL CONTENDOR
		 */
		jpanel.setLayout(null);
		jpanel.setBackground(Color.lightGray);
		
		for(int i = 0; i < label.length; i++){
			label[i] = new JLabel();
			text[i] = new JTextField();
			
			/*
			 * PROPIEDADES DE LOS CONTROLES
			 */
			label[i].setBounds(new Rectangle(15, (i + 1) * 40, 60, 25));
			label[i].setText("Dato " + (i + 1));
			label[i].setBorder(border);
			label[i].setHorizontalAlignment(SwingConstants.CENTER);
			text[i].setBounds(new Rectangle(100, (i + 1) * 40, 60, 25));
			
			/*
			 * ADICION DE LOS CONTROLES AL CONTENEDOR
			 */
			jpanel.add(label[i], null);
			jpanel.add(text[i], null);
		}
		
		/*
		 * PROPIEDADES DEL FORMULARIO
		 */
		setSize(200, 300);
		setTitle("Form5");
		setVisible(true);
	}
	
	public static void main(String[] args){
		new ProgramaArrayGrafico();
	}

}
