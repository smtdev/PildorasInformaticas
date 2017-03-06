package com.frenetyklok.avanzado.t15.ejercicio;

public class AvesEnZoo {
	
	private String tipoAve;
	private int hembras;
	private int machos;
	private int total = hembras + machos;
	
	public AvesEnZoo(String tipoAve, int hembras, int machos){
		this.tipoAve = tipoAve;
		this.hembras = hembras;
		this.machos = machos;
	}
	
	public String toString(){
		return ("La especie: " + tipoAve + " cuenta con " + hembras + " hembras y " + machos + " machos.");
	}

}
