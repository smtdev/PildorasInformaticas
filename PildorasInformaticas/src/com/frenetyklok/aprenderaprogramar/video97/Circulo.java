package com.frenetyklok.aprenderaprogramar.video97;

public class Circulo implements Figura{
	
	private float radio;
	
	public Circulo(float radio){
		this.radio = radio;
	}
	
	public float area(){
		return 2f * Figura.PI * this.radio * this.radio;
	}
	
	

}