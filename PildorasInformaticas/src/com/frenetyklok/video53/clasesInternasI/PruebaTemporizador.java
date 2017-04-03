package com.frenetyklok.video53.clasesInternasI;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;  

public class PruebaTemporizador {
	
	public static void main(String[] args){
		
		Reloj miReloj = new Reloj(2000, true);
		miReloj.enMarcha();
		
		//para que el programa no se termine
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		System.exit(0);// para terminar el programa 
		
	}

}


class Reloj{
	
	private int intervalo;
	private boolean sonido;
	
	public Reloj(int intervalo, boolean sonido){
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	public void enMarcha(){
		ActionListener oyente = new DameLaHora();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}
	
	//las clases internas son las unicas que pueden tener el modificador de acceso private
	private class DameLaHora implements ActionListener{

		public void actionPerformed(ActionEvent e){
			Date ahora = new Date();
			System.out.println("Te pongo la hora cada 2 segundos: " + ahora);
			
			if(sonido){//accedemos a un campo de ejemplar private pero podemos acceder ya que estamos en una clase interna
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
		
	}
	
}
