package com.frenetyklok.aprenderaprogramar.video97;

import java.util.ArrayList;
import java.util.List;

public class TestInterface {
	
	public static void main(String[] args){
		Figura cuadrado1 = new Cuadrado(3.5f);
		Figura cuadrado2 = new Cuadrado(2.2f);
		Figura cuadrado3 = new Cuadrado(8.9f);
		
		Figura circulo1 = new Circulo(3.5f);
		
		Figura rectangulo1 = new Rectangulo(2.25f, 2.55f);
		
		List<Figura> serieDeFiguras = new ArrayList<Figura>();
		
		serieDeFiguras.add(cuadrado1);
		serieDeFiguras.add(cuadrado2);
		serieDeFiguras.add(cuadrado3);
		serieDeFiguras.add(circulo1);
		serieDeFiguras.add(rectangulo1);
		
		System.out.println("El area del cuadrado1 es: " + cuadrado1.area());
		
		float areaTotal = 0;
		
		for(Figura tmp: serieDeFiguras){
			areaTotal += tmp.area();
		}
		
		System.out.println("Tenemos un total de: " + serieDeFiguras.size() + " figuras con un área total de " +
				areaTotal + " unidades de área.");
	}

}
