package com.frenetyklok.hastavideo26;

import java.util.Arrays;

public class PruebaConArrays {

	public static void main(String[] args) {


		int[] numeros = {2, 3, 5, 4};
		
		int[] numerosInversos = numeros;
		
		if(numeros.equals(numerosInversos)){
			System.out.println("Los arrays son el mismo");
		}
		
		//AL IGUALAR LOS DOS ARRAYS, TODO LO QUE LE HAGA A UNO SE LO HARÉ AL OTRO
		
		numerosInversos[0] = 11;
		
		System.out.println(numeros[0]);
		
		
		//USANDO EL METODO EQUALS DE LA CLASE OBJECT PODEMOS COMPROBAR QUE SON EL MISMO OBJETO.
		//POR ESO LO QUE LE HAGAMOS A UNO SE LO HACEMOS AL OTRO...
		if(Arrays.equals(numerosInversos, numeros)){
			System.out.println("Los arrays son el mismo");
		}
		
		

	}

}
