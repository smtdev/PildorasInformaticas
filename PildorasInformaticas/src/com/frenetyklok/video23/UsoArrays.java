package com.frenetyklok.video23;

public class UsoArrays {
	
	public static void main(String[] args){
		
		int[] miMatriz = new int[5];
		//también podemos poner int miMatriz[] = new int[5];
		
		miMatriz[0] = 5;
		miMatriz[1] = 38;
		miMatriz[2] = -15;
		miMatriz[3] = 92;
		miMatriz[4] = 71;
		
		System.out.println(miMatriz[3]);
		
		//podemos imprimir todos los elementos lo podemos hacer con un bucle for
		
		for(int i = 0; i < miMatriz.length; i++){
			System.out.println(miMatriz[i]);
		}
		
		//otra forma de declarar una matriz
		
		System.out.println("A partir de aquí es otra matriz!!");
		
		int[] miMatriz2 = {4, 3, 43, -2, 42};
		
		for(int i = 0; i < miMatriz2.length; i++){
			System.out.println(miMatriz2[i]);
		}
		
	}

}
