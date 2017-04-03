package com.frenetyklok.video52.InterfacesYClasesInternasIV;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

public class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e){
		
		Date ahora = new Date();
		System.out.println("Te pongo la hora cada cinco segundos: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();//Toolkit nos sirve para acceder a los recursos del SO . en concreto esto da un sonido
		
	}

}
