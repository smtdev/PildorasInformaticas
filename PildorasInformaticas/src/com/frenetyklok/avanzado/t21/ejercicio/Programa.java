package com.frenetyklok.avanzado.t21.ejercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Programa {
	
	public static void main(String[] args){
		
		Random rd = new Random();
		List<Vehiculo> lista = new LinkedList<Vehiculo>();
		//List<Vehiculo> lista = new ArrayList<Vehiculo>(); ES MAS EFICIENTE CON LINKEDLIST POR LAS INSECIONES AL FINAL
		int valor;
		for(int i = 1; i <= 5000; i++){
			valor = rd.nextInt(4) + 1;
			switch(valor){
			case 1:
				lista.add(new Vehiculo(i, "Coche"));
				break;
			case 2:
				lista.add(new Vehiculo(i, "Camión"));
				break;
			case 3:
				lista.add(new Vehiculo(i, "Furgoneta"));
				break;
			case 4:
				lista.add(new Vehiculo(i, "Moto"));
				break;
			}
		}
		
		int coches = 0;
		int camiones = 0;
		int furgonetas = 0;
		int motos = 0;
		
		for (int i = 0; i < lista.size(); i++){
			if(lista.get(i).getTipo().equals("Coche")) coches += 1;
			else if(lista.get(i).getTipo().equals("Camión")) camiones += 1;
			else if(lista.get(i).getTipo().equals("Furgoneta")) furgonetas += 1;
			else if(lista.get(i).getTipo().equals("Moto")) motos += 1;
		}
		
		System.out.println("En la lista hay " + coches + " coches.");
		System.out.println("En la lista hay " + camiones + " camiones.");
		System.out.println("En la lista hay " + furgonetas + " furgonetas.");
		System.out.println("En la lista hay " + motos + " motos.");
		
		System.out.println("En total hay: " + (coches + camiones + furgonetas + motos) + " vehículos.");
		
		long antes;
		antes = System.nanoTime();
		
		int sizeLista = lista.size();
		
		Iterator<Vehiculo> it = lista.iterator();
		while(it.hasNext()){
			if(!it.next().getTipo().equals("Coche")){
				it.remove();
			}
		}
		
		for(int i = lista.size(); i < sizeLista; i++){
			lista.add(new Vehiculo(i, "Coche"));
		}
		
		System.out.println("Tiempo empleado: " + (System.nanoTime()-antes));
		
		coches = 0;
		camiones = 0;
		furgonetas = 0;
		motos = 0;
		
		for (int i = 0; i < lista.size(); i++){
			if(lista.get(i).getTipo().equals("Coche")) coches += 1;
			else if(lista.get(i).getTipo().equals("Camión")) camiones += 1;
			else if(lista.get(i).getTipo().equals("Furgoneta")) furgonetas += 1;
			else if(lista.get(i).getTipo().equals("Moto")) motos += 1;
		}
		
		
		System.out.println("Al final de las operaciones: ");
		System.out.println("En la lista hay " + coches + " coches.");
		System.out.println("En la lista hay " + camiones + " camiones.");
		System.out.println("En la lista hay " + furgonetas + " furgonetas.");
		System.out.println("En la lista hay " + motos + " motos.");
		
		System.out.println("En total hay: " + (coches + camiones + furgonetas + motos) + " vehículos.");
		
	}

}
