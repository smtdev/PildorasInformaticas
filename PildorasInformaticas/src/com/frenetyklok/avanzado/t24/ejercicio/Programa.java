package com.frenetyklok.avanzado.t24.ejercicio;

import java.util.SortedSet;//interface
import java.util.TreeSet;//clase
import java.util.Scanner;
import java.util.Iterator;
import java.util.Random;

public class Programa {
	
	public static void main(String[] args){
		
		Random rd = new Random();
		SortedSet<Hotel> ssh = new TreeSet<Hotel>();
		int precio;
		int zona;
		
		for(int i = 0; i < 12; i++){
			precio = rd.nextInt(111) + 40;
			zona = rd.nextInt(3) + 1;
			switch(zona){
			case 1:
				ssh.add(new Hotel(i, "Playa", precio));
				break;
			case 2:
				ssh.add(new Hotel(i, "Montaña", precio));
				break;
			case 3:
				ssh.add(new Hotel(i, "Rural", precio));
				break;
			}
		}
		
		System.out.println("Estos son todos los hoteles de la base de datos:");
		System.out.println(ssh);
		
		System.out.println("*************");
		System.out.println("Elige la zona en que quieres el hotel:");
		Scanner escaner = new Scanner(System.in);
		String zonaElegida = escaner.nextLine();
		
		SortedSet<Hotel> hotelesElegidos = new TreeSet<Hotel>();
		Iterator<Hotel> it = ssh.iterator();
		while(it.hasNext()){
			Hotel tmp = it.next();
			if(tmp.getZona().equals(zonaElegida)){
				hotelesElegidos.add(tmp);
			}
		}
		
		System.out.println("Estos son los hoteles elegidos en: " + zonaElegida);
		System.out.println(hotelesElegidos);

		
	}

}
