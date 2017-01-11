package com.frenetyklok.aprenderaprogramar.tema41;

public class CocinaCasa {
	
	private boolean esIndependiente;
	private int numeroDeFuegos;
	
	public CocinaCasa(){
		this.esIndependiente = false;
		this.numeroDeFuegos = 0;
	}
	
	public boolean getEsIndependiente(){
		return esIndependiente;
	}
	
	public int getNumeroDeFuegos(){
		return numeroDeFuegos;
	}

}
