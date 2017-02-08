package com.frenetyklok.aprenderaprogramar.video94.ejercicio;

public class Circulo extends Figura{
	
	public Circulo(double radio){
		this.setDimensionPrincipal(radio);
	}
	
	public double calculaArea(){
		return this.getDimensionPrincipal() * this.getDimensionPrincipal() * Math.PI;
	}

}
