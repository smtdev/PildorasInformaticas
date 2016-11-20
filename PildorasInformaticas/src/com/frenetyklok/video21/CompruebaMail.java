package com.frenetyklok.video21;

import javax.swing.JOptionPane;

public class CompruebaMail {
	
	public static void main(String[] args){
		
		boolean arroba = false;	
		String mail = JOptionPane.showInputDialog("Introduce mail: ");
		
		//we are going to run arroba finding the character @
		
		for(int i = 0; i < mail.length(); i++){
			
			if(mail.charAt(i) == '@'){
				arroba = true;
			}
			
		}
		
		if(arroba == true){
			System.out.println("El mail es correcto!");
		}
		else{
			System.out.println("El mail no es correcto!");
		}
		
		
	}

}
