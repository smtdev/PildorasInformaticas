package com.frenetyklok.aprenderaprogramar.video97.ejemplo;

import java.util.ArrayList;

public class TestInterface {
	
	public static void main(String[] args){
		
		Edificio polideportivo1 = new Polideportivo(1, 1000.0);
		Edificio polideportivo2 = new Polideportivo(2, 2000.0);
		Edificio polideportivo3 = new Polideportivo(3, 3000.0);
		
		Edificio oficinas1 = new EdificioOficinas(90, 1000.0);
		Edificio oficinas2 = new EdificioOficinas(111, 2002.0);
		
		ArrayList<Edificio> listaEdificios = new ArrayList<Edificio>();
		
		listaEdificios.add(polideportivo1);
		listaEdificios.add(polideportivo2);
		listaEdificios.add(polideportivo3);
		listaEdificios.add(oficinas1);
		listaEdificios.add(oficinas2);
		
		System.out.println("Estos son los edificios que hay en la lista: ");
		
		for(Edificio tmp: listaEdificios){
			System.out.println(tmp.toString());
		}
		
		
	}

}
