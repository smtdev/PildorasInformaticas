package com.frenetyklok.hastavideo26;

import javax.swing.JOptionPane;

public class EjerciciosMatricesI {

	public static void main(String[] args) {
		
		//CREAR UNA MATRIZ CON 5 FILAS Y LAS COLUMNAS QUE DECIDA EL USUARIO Y 
		//LLENARLA CON NÚMEROS ENTEROS ALEATORIOS ENTRE 1 Y 10
		
		int columnas = Integer.parseInt(JOptionPane.showInputDialog("Introducir número de columnas"));
		int[][] matriz = new int[5][columnas];
		
		//CON MATRIZ.LENGTH TENEMOS EL NUMERO DE FILAS DE LA MATRIZ
		//CON MATRIZ[0].LENGTH TENEMOS EL NUMERO DE COLUMNAS DE LA MATRIZ
		
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[0].length; j++){
				matriz[i][j] = (int)Math.floor(Math.random()*10 + 1);
			}
		}
		
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[0].length; j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
