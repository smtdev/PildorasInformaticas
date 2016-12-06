package com.frenetyklok.hastavideo26;

import javax.swing.JOptionPane;

public class EjerciciosFuncionesI {
	
	//crea una funci�n que devuelva la suma de dos n�meros
	
	public static int sumaNumeros(int a, int b){
		return a + b;
	}
	
	//crea una funci�n que devuelva un n�mero aleatorio entre dos n�meros que nosotros indiquemos
	
	public static int numeroAleatorio(int minimo, int maximo){
		int aleatorio = (int) (Math.floor(Math.random() * (maximo - minimo + 1) + minimo));
		return aleatorio;
	}

	public static void main(String[] args) {
		
		int minimo = Integer.parseInt(JOptionPane.showInputDialog("Introduce m�nimo..."));
		int maximo = Integer.parseInt(JOptionPane.showInputDialog("Introduce m�ximo..."));
		
		
		for(int i = 0; i < 12; i++){
			int aleatorio = numeroAleatorio(minimo, maximo);
			System.out.println(aleatorio);
		}
		
		
	}

}
