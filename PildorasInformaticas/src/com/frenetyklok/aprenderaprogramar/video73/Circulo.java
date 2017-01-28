package com.frenetyklok.aprenderaprogramar.video73;

public class Circulo {
	
	private static final double  PI = 3.1416;
	private double radio;
	
	public Circulo(double radio){
		this.radio = radio;
	}
	
	public void setRadio(int radio){
		this.radio = radio;
	}
	
	public double getRadio(){
		return this.radio;
	}
	
	public double areaCirculo(){
		return this.radio * this.radio * PI;
	}
	
	public double longitudCirculo(){
		return this.radio * 2 * PI;
	}
	
	

}
