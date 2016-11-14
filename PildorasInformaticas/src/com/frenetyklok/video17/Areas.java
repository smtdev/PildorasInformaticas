package com.frenetyklok.video17;

import java.util.*; //para usar la clase Scanner
import javax.swing.*;// para usar  JOptionPane import javax.swing.plaf.synth.SynthSpinnerUI;

public class Areas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// \n nos hace un salto de linea
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo");
		
		int opcion = entrada.nextInt();
		
		switch(opcion) {
			case 1:
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
				System.out.println("El área es " + Math.pow(lado, 2));
				break;
			case 2:
				int ladoUno = Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado"));
				int ladoDos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el otro lado"));
				System.out.println("El área es " + (ladoUno * ladoDos));
				break;
			case 3:
				int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				System.out.println("El área es " + (base * altura / 2));
				break;
				
			default:
				System.out.println("La opción elegida no es válida");
					
			
		}

	}

}
