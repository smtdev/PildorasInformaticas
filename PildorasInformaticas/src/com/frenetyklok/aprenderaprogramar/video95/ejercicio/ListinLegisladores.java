package com.frenetyklok.aprenderaprogramar.video95.ejercicio;

import java.util.ArrayList;

public class ListinLegisladores {
	
	private ArrayList<Legislador> listaLegisladores;
	
	public ListinLegisladores(){
		this.listaLegisladores = new ArrayList<Legislador>();
	}
	
	public void addLegislador(Legislador legislador){
		this.listaLegisladores.add(legislador);
	}
	
	public void mostrarLegisladores(){
		
		for(Legislador tmpLegislador: this.listaLegisladores){
			System.out.println(tmpLegislador.toString());
			System.out.println("El legislador trabaja en el: " + tmpLegislador.getCamaraTrabaja());
		}
					
	}

}
