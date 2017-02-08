package com.frenetyklok.aprenderaprogramar.video94.ejercicio;

public class TestFiguras {
	
	public static void main(String[] args){
		
		Cuadrado cuadrado1 = new Cuadrado(4);
		Cuadrado cuadrado2 = new Cuadrado(4);
		Cuadrado cuadrado3 = new Cuadrado(5);
		
		Circulo circulo1 = new Circulo(3);
		Circulo circulo2 = new Circulo(3);
		Circulo circulo3 = new Circulo(5);
		
		System.out.println("Los cuadrados 1 y 2 son iguales?: " + cuadrado1.equals(cuadrado2));
		System.out.println("Los cuadrados 1 y 3 son iguales?: " + cuadrado1.equals(cuadrado3));
		System.out.println("Los círculos 1 y 2 son iguales?: " + circulo1.equals(circulo2));
		System.out.println("Los círculos 1 y 3 son iguales?: " + circulo1.equals(circulo3));
		
	}

}
