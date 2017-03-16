package com.frenetyklok.avanzado.t22.ejercicio;

import java.util.Vector;
import java.math.BigDecimal;
import java.util.Random;

public class Programa {
	
	public static void main(String[] args){
		Vector<Paquete> v = new Vector<Paquete>(5, 1);
		Random rd = new Random();
		
		int cargaMaximaContenedor = 100 * v.capacity();
		
		System.out.println("La capacidad de carga inicial del contenedor es: " + cargaMaximaContenedor + " Kg.");
		
		for(int i = 0; i < 50; i++){
			v.add(new Paquete(i, (rd.nextInt(71) + 80)));
		}
		
		System.out.println("El número de paquetes es: " + v.capacity());
		cargaMaximaContenedor = 100 * v.capacity();
		System.out.println("La capacidad de carga del contenedor es: " + cargaMaximaContenedor + " Kg.");
		
		int cargaRealContenedor = 0;
		
		for(int i = 0; i < v.size(); i++){
			cargaRealContenedor += v.get(i).getPesoPaquete();
		}
		
		System.out.println("El peso de los paquetes que se quieren introducir en el contenedor es: " + cargaRealContenedor + " Kg.");
		
		if(cargaRealContenedor > cargaMaximaContenedor){
			System.out.println("Necesitamos cargar: " + (cargaRealContenedor - cargaMaximaContenedor) + " Kg. extra.");
			BigDecimal extra = (cargaRealContenedor - cargaMaximaContenedor)/100;
			System.out.println(extra);
			int nuevaCarga =  (int)Math.ceil(extra);
			v.ensureCapacity(50 + nuevaCarga);//revisar redondeos
			System.out.println("La nueva capacidad de paquetes es: " + v.capacity());
		}
		
		
		
		/*
		 * FALTARIA POR PONER LOS CASOS EN LOS QUE EL VALOR SEA IGUAL O MENOR QUE CARGAMAXIMACONTENEDOR
		 */
		
	}

}
