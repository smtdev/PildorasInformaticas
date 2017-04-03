package com.frenetyklok.video54.clasesInternasLocales;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;  

public class PruebaTemporizador {
	
	public static void main(String[] args){
		
		Reloj miReloj = new Reloj();
		miReloj.enMarcha(2000, true);
		
		//para que el programa no se termine
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		System.exit(0);// para terminar el programa ??
		
	}

}


class Reloj{
	
	/*
	 * SE PUEDEN ELIMINAR LOS CAMPOS DE CLASE
	 * Y SE PUEDEN PONER EN EL METODO QUE CONTIENE LA CLASE INTERNA
	 * CON LO CUAL YA NO NECESITAREMOS EL CONSTRUCTOR
	 */
	
	//private int intervalo;
	//private boolean sonido;
	
	/*public Reloj(int intervalo, boolean sonido){
		this.intervalo = intervalo;
		this.sonido = sonido;
	}*/
	
	
	//los parámetros que se vayan a usar en la clase interna local deben ser final
	//esto implica que no se pueden modificar posteriormente
	public void enMarcha(int intervalo, final boolean sonido){
		
		//las clases internas locales no pueden tener modificador de acceso
		//si ponemos la clase interna después de instanciación da error?
		class DameLaHora implements ActionListener{

			public void actionPerformed(ActionEvent e){
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 2 segundos: " + ahora);
				
				if(sonido){//accedemos a un campo de ejemplar private pero podemos acceder ya que estamos en una clase interna
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente = new DameLaHora();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
		
		
		
	}
	
	
	
}
