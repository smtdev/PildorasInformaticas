package com.frenetyklok.avanzado.tema3;

import java.util.Scanner;

/**
 * Esta clase permite la entrada de valores por consola
 * @author Frenetyklok
 *@version 1.0
 */

public class EntradaConsola {
	
	private String mensajeTexto;
	private Scanner escaner;
	
	
	/**
	 * Constructor sin mensaje de texto de entrada
	 * @param No tiene parametros
	 */
	public EntradaConsola(){
		this.mensajeTexto = "";
		this.escaner = new Scanner(System.in);
	}
	
	/**
	 * Constructor al que se le pasa el mensaje de consola como parámetro
	 * @param mensajeTexto Es un String que aparece cuando se pida introducir valor por consola
	 */
	
	public EntradaConsola(String mensajeTexto){
		this.mensajeTexto = mensajeTexto;
		this.escaner = new Scanner(System.in);
	}
	
	/**
	 * Método que devuelve el mensaje de texto del objeto EntradaConsola
	 * @return El mensaje de texto del objeto EntradaConsola
	 */
	
	public String getMensajeTexto(){
		return this.mensajeTexto;
	}
	
	/**
	 * Método que permite establecer un nuevo mensaje de consola
	 * 
	 */
	
	public void setMensajeTexto(String mensajeTexto){
		this.mensajeTexto = mensajeTexto;
	}
	
	/**
	 * Método que devuelve el valor de entrada de consola como un String
	 * @return El valor de entrada por consola
	 */
	public String getEntradaTextoConsola(){
		return escaner.nextLine();
	}
	
	/**
	 * Método que cierra el objeto EntradaConsola
	 */
	public void cierraEntradaConsola(){
		this.escaner.close();
	}

}
