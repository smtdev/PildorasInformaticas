package com.frenetyklok.aprenderaprogramar.video81;

public class Vehiculo {
	
	enum MarcaDeVehiculo {FORD, TOYOTA, SUZUKI, RENAULT, SEAT};
	
	private String matricula;
	private MarcaDeVehiculo marca;
	
	public Vehiculo(String matricula, MarcaDeVehiculo marca){
		this.marca = marca;
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public MarcaDeVehiculo getMarca() {
		return marca;
	}

	public void setMarca(MarcaDeVehiculo marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		
		return "Marca del coche: " + this.marca + ". Matrícula: " + this.matricula;
	}
	
	
	
}
