package com.frenetyklok.aprenderaprogramar.video72;

import java.util.Random;
import java.util.ArrayList;

public class SerieDeAleatorios {
	
	//CAMPOS DE CLASE
	
	private ArrayList<Integer> serieAleatoria;
	
	//CONSTRUCTOR
	
	public SerieDeAleatorios(int numeroItems){
		
		this.serieAleatoria = new ArrayList<Integer>();
		
		for(int i = 0; i < numeroItems; i++){
			this.serieAleatoria.add(0);
		}
		
		System.out.println("Serie inicializada. El número de elementos en la serie es: " + getNumeroItems());
	}
	
	public int getNumeroItems(){return this.serieAleatoria.size();}
	
	public void generarSerieDeAleatorios(){
		
		Random numAleatorio = new Random();
		
		for(int i = 0; i < serieAleatoria.size(); i++){
			serieAleatoria.set(i,  numAleatorio.nextInt(1000));
		}
		
		System.out.println("Serie generada!");
		
	}
	
	public void mostrarSerie(){
		System.out.println("Procedemos a mostrar la serie:");
		for(Integer tmpObjeto: serieAleatoria){
			
			System.out.println(" " + tmpObjeto.toString());
		}
	}

}
