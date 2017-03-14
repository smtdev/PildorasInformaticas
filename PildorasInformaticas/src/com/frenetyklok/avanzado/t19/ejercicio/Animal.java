package com.frenetyklok.avanzado.t19.ejercicio;

public class Animal {
	
	private String especie;
	private String nombre;
	private double peso;
	private int patas;
	
	public Animal(String especie, String nombre, double peso, int patas){
		this.especie = especie;
		this.nombre = nombre;
		this.peso = peso;
		this.patas = patas;
	}

	public String getEspecie() {
		return especie;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public int getPatas() {
		return patas;
	}
	
	@Override
	public String toString(){
		return "Especie: " + this.especie + ". Nombre: " + 
				this.nombre + ". Peso: " + this.peso + ". Patas: " + this.patas + ".";
	}

}
