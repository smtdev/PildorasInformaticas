package com.frenetyklok.hastavideo26;

import javax.swing.JOptionPane;

public class EjerciciosMatricesII {
	
	public static void main(String[] args){
		
		//CREAR DOS MATRICES CUADRADAS Y SUMAR SUS VALORES. LOS RESULTADOS SE DEBEN ALMACENAR EN OTRA MATRIZ.
		//LOS VALORES Y LA LONGITUD DEBEN SER INSERTADOS POR EL USUARIO Y DEBEN MOSTRARSE TODAS LAS MATRICES
		
		int dimension = Integer.parseInt(JOptionPane.showInputDialog("Dimensión"));
		int[][] matriz1 = new int[dimension][dimension];
		int[][] matriz2 = new int[dimension][dimension];
		
		for(int i = 0; i < matriz1.length; i++){
			for(int j = 0; j < matriz1[0].length; j++){
				matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor " + i + "-" + j + " de matriz1"));
			}
		}
		
		for(int i = 0; i < matriz2.length; i++){
			for(int j = 0; j < matriz2[0].length; j++){
				matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor " + i + "-" + j + " de matriz2"));
			}
		}
		
		int[][] matrizSuma = new int[dimension][dimension];
		
		for(int i = 0; i < matriz2.length; i++){
			for(int j = 0; j < matriz2[0].length; j++){
				matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		
		System.out.println("Esta es la matriz1");
		for(int i = 0; i < matriz1.length; i++){
			for(int j = 0; j < matriz1[0].length; j++){
				 System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Esta es la matriz2");
		for(int i = 0; i < matriz2.length; i++){
			for(int j = 0; j < matriz2[0].length; j++){
				 System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Esta es la matrizSuma");
		for(int i = 0; i < matrizSuma.length; i++){
			for(int j = 0; j < matrizSuma[0].length; j++){
				 System.out.print(matrizSuma[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}
	

}
