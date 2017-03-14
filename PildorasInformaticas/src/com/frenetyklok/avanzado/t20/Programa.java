package com.frenetyklok.avanzado.t20;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Programa {
	
	public static void main(String[] args){
		Random rd = new Random();
		List<Cuadrupedo> lista = new ArrayList<Cuadrupedo>();
		int valor;
		for(int i = 1; i <= 10000; i++){
			valor = rd.nextInt(4) + 1;
			switch(valor){
			case 1:
				lista.add(new Cuadrupedo(i, "León"));
				break;
			case 2:
				lista.add(new Cuadrupedo(i, "Gato"));
				break;
			case 3:
				lista.add(new Cuadrupedo(i, "Perro"));
				break;
			case 4:
				lista.add(new Cuadrupedo(i, "Elefante"));
				break;
			}
		}
		
		for (int i = 1000; i <= lista.size(); i+=1000){
			System.out.println(lista.get(i - 1).toString());
		}
		
		System.out.println();
		System.out.println("Ahora tendremos un resumen");
		System.out.println();
		
		int perros = 0;
		int leones = 0;
		int gatos = 0;
		int elefantes = 0;
		
		for (int i = 0; i < lista.size(); i++){
			if(lista.get(i).getTipo().equals("León")) leones += 1;
			else if(lista.get(i).getTipo().equals("Gato")) gatos += 1;
			else if(lista.get(i).getTipo().equals("Perro")) perros += 1;
			else if(lista.get(i).getTipo().equals("Elefante")) elefantes += 1;
		}
		
		System.out.println("En la lista hay " + leones + " leones.");
		System.out.println("En la lista hay " + gatos + " gatos.");
		System.out.println("En la lista hay " + perros + " perros.");
		System.out.println("En la lista hay " + elefantes + " elefantes.");
		
		System.out.println("En total hay: " + (leones + gatos + perros + elefantes) + " animales.");
	}

}
