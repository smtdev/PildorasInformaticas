package com.frenetyklok.video08;

public class DeclaracionVariables {

	public static void main(String[] args) {
		
		/*
		final int c = 5;
		c = 7; //tenemos un error porque no podemos modificar el valor de la constante
		
		System.out.println(c);
		*/
		
		final double apulgadas = 2.54;
		
		double centimetros = 6;
		
		double resultado = centimetros / apulgadas;
		
		System.out.println("En " + centimetros + " cm hay " + resultado + " pulgadas.");
		
	}

}
