package com.frenetyklok.aprenderaprogramar.video80;

import java.util.ArrayList;
import java.util.Random;

/**
 * Esta clase define objetos que contiene tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto
 * @author Frenetyklok
 * @version 1.0
 */

public class SerieDeAleatorios {
	
	private ArrayList<Integer> serieAleatoria;
	
	/**
	 * Constructor para la serie de n�meros aleatorios
	 * @param numeroItems El par�metro numeroItems define el n�mero de elementos que va a tener la serie aleatoria
	 */
	
	public SerieDeAleatorios(int numeroItems){
		serieAleatoria = new ArrayList<Integer>();
		for(int i = 0; i < numeroItems; i++){
			System.out.println("Serie inicializada. El n�mero de elementos de la serie es: " + numeroItems);
		}
	}//CIERRE DEL CONSTRUCTOR
	
	/**
	 * M�todo que devuelve el n�mero de Items existentes en la serie.
	 * @return El n�mero de Items de que consta la serie
	 */
	
	public int getNumeroItems(){
		return serieAleatoria.size();
	}
	
	/**
	 * M�todo que genera la serie de n�meros aleatorios
	 */
	
	public void generarSerieDeAleatorios(){
		
		Random numeroAleatorio;
		numeroAleatorio = new Random();
		
		for(int i = 0; i < serieAleatoria.size(); i++){
			serieAleatoria.set(i, numeroAleatorio.nextInt(1000));
		}
		
		System.out.println("Serie generada.");
		
	}
	
	

}
