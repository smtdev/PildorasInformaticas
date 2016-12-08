package com.frenetyklok.hastavideo26;

import javax.swing.JOptionPane;

public class EjerciciosMatricesIII {
	
	//REPETIMOS EL EJERCICIO DE MATRICES II PERO USANDO METODOS PARA ACORTARLO
	
	public static int[][] crearMatriz(int valor, String nombre){
		
		int[][] matriz = new int[valor][valor];
		
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[0].length; j++){
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor " + i + "-" + j + " de " + nombre));
			}
		}
		return matriz;
	}
	
	public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2){
		int[][] matrizSuma = new int[matriz1.length][matriz1[0].length];
		if(matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length){
			for(int i = 0; i < matriz2.length; i++){
				for(int j = 0; j < matriz2[0].length; j++){
					matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}
			return matrizSuma;
		}else{
			int[][] resultadoError = {{0,0}, {0,0}};
			return  resultadoError;
		}
	}
	
	public static void printMatriz(int[][] matriz){
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[0].length; j++){
				 System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int dimension = Integer.parseInt(JOptionPane.showInputDialog("Introduce dimensión matrices"));
		int[][] matriz1 = crearMatriz(dimension, "matriz1");
		int[][] matriz2 = crearMatriz(dimension, "matriz2");
		int[][] matrizSuma = sumaMatrices(matriz1, matriz2);
		System.out.println("Esta es la matriz1");
		printMatriz(matriz1);
		System.out.println("Esta es la matriz2");
		printMatriz(matriz2);
		System.out.println("Esta es la matrizSuma");
		printMatriz(matrizSuma);
		 
	}

}
