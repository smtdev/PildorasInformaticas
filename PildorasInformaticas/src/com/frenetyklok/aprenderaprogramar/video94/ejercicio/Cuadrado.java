package com.frenetyklok.aprenderaprogramar.video94.ejercicio;

public class Cuadrado extends Figura {
	
	public Cuadrado(double lado){
		this.setDimensionPrincipal(lado);
	}
	
	public double calculaArea(){
		return this.getDimensionPrincipal() * this.getDimensionPrincipal();
	}
	
	

}
