package com.frenetyklok.hastavideo26;


import java.util.Arrays;

import javax.swing.JOptionPane;

public class EjerciciosArraysIII {

	public static void main(String[] args) {
		
		//LLENAR UN ARRAY CON EL METODO FILL
		
		int longitudArray = Integer.parseInt(JOptionPane.showInputDialog("Introducir tamaño del Array"));
		int[] numeros = new int[longitudArray];
		
		for(int i = 0; i < numeros.length; i++){
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor de la posición " + i));
			Arrays.fill(numeros, i , i+1, valor);
		}
		
		for(int i = 0; i < numeros.length; i++){
			System.out.println(numeros[i]);
		}
		
		System.out.println();
		//AHORA HAREMOS UNA COPIA DE ESTE ARRAY CON EL METODO COPYOF
		
		//DE ESTA FORMA HACEMOS UNA COPIA PERO SON DOS OBJETOS INDEPENDIENTES Y LO QUE LE HAGAMOS A UNO 
		//NO SE LO HACEMOS AL OTRO COMO SI SUCEDE SI LOS IGUALAMOS. EN ESTE CASO ES EL MISMO OBJETO.
		
		int[] copiaNumeros = Arrays.copyOf(numeros, 3);
		
		
		//PARA SABER SI LOS ARRAYS SON IGUALES. PARA COMPROBAR SI SON EL MISMO OBJETO SE USA EL EQUALS NO STATIC
		if(Arrays.equals(copiaNumeros, numeros)){
			System.out.println("Los arrays son iguales");
		}else{
			System.out.println("Los arrays no son iguales");
		}
		
		//PARA PROBAR SI SON EL MISMO OBJETO. ES EL METODO EQUALS DE LA CLASE OBJECT. PROBAMOS SI ES EL MISMO OBJETO
		if(numeros.equals(copiaNumeros)){
			System.out.println("Los arrays son el mismo objeto");
		}else{
			System.out.println("Los arrays no son el mismo objeto");
		}
		
		numeros[1] = 2;
		
		for(int i = 0; i < copiaNumeros.length; i++){
			System.out.println(copiaNumeros[i]);
		}
		
		for(int i = 0; i < numeros.length; i++){
			System.out.println(numeros[i]);
		}
		
		copiaNumeros[2] = 4;
		System.out.println();
		
		for(int i = 0; i < copiaNumeros.length; i++){
			System.out.println(copiaNumeros[i]);
		}
		
		for(int i = 0; i < numeros.length; i++){
			System.out.println(numeros[i]);
		}

	}

}
