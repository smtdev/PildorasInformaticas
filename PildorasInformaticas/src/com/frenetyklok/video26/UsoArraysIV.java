package com.frenetyklok.video26;

public class UsoArraysIV {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{10, 15, 18, 19, 21},
				{5, 25, 37, 41, 15},
				{7, 19, 32, 14, 90},
				{85, 2, 7, 40, 27}
		};
		
		
		for(int[] fila : matrix){
			System.out.println();
			for(int x : fila){
				System.out.println(x + " ");
			}
		}

	}

}