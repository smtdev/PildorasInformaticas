package com.frenetyklok.video18;

import javax.swing.*;

public class AccesoAplicacion {

	public static void main(String[] args) {
		
		String clave = "Pablo";
		String pass = "";
		
		//la forma correcta de comparar String es con equals y no con ==. El resto de comparaciones con ==
		while(clave.equals(pass) == false){
			
			pass = JOptionPane.showInputDialog("Introduce la contrase�a");
			
			if(clave.equals(pass) == false){
				System.out.println("Contrase�a incorrecta!");
			}
			
		}
		
		System.out.println("Contrase�a correcta!");

	}

}
