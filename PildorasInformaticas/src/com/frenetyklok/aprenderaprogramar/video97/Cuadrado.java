package com.frenetyklok.aprenderaprogramar.video97;

public class Cuadrado implements Figura {
	
	private float lado;
	
	public Cuadrado(float lado){
		this.lado = lado;
	}
	
	public float area(){
		return lado * lado;
	}

}
