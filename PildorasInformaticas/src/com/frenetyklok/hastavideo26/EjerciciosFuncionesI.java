package com.frenetyklok.hastavideo26;

import javax.swing.JOptionPane;

public class EjerciciosFuncionesI {
	
	//crea una función que devuelva la suma de dos números
	
	public static int sumaNumeros(int a, int b){
		return a + b;
	}
	
	//crea una función que devuelva un número aleatorio entre dos números que nosotros indiquemos
	
	public static int numeroAleatorio(int minimo, int maximo){
		int aleatorio = (int) (Math.floor(Math.random() * (maximo - minimo + 1) + minimo));
		return aleatorio;
	}

	public static void main(String[] args) {
		
		int minimo = Integer.parseInt(JOptionPane.showInputDialog("Introduce mínimo..."));
		int maximo = Integer.parseInt(JOptionPane.showInputDialog("Introduce máximo..."));
		
		
		for(int i = 0; i < 12; i++){
			int aleatorio = numeroAleatorio(minimo, maximo);
			System.out.println(aleatorio);
		}
		
		
	}

}
