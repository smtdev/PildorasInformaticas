package com.frenetyklok.avanzado.tema7;

public class RedondeoDecimales {
	
	public static double redondea(double valor, int numeroDecimales){
		
		int parteEntera = (int)valor;
		double decimales = valor - parteEntera;
		
		return (double)parteEntera + (Math.round(decimales * Math.pow(10, numeroDecimales))/Math.pow(10, numeroDecimales));
		
	}
	
	public static double redondea2(double valor, int numeroDecimales){
		
		int parteEntera;
		double resultado;
		
		resultado = valor;
		parteEntera = (int)valor;
		
		resultado = (resultado - (double)parteEntera) * Math.pow(10, numeroDecimales);
		resultado = (double)Math.round(resultado);
		resultado = (double)parteEntera + (resultado/Math.pow(10, numeroDecimales));
		return resultado;
	}
	
	//esta no funciona como toca por emplear Math.floor
	public static double redondea3(double valor, int numeroDecimales){
		
		double parteEntera, resultado;
		resultado = valor;
		parteEntera = Math.floor(resultado);
		System.out.println("La parte entera es: " + parteEntera);
		resultado = (resultado - parteEntera) * Math.pow(10, numeroDecimales);
		resultado = Math.round(resultado);
		resultado = (resultado/Math.pow(10, numeroDecimales)) + parteEntera;
		return resultado;
	}

}
