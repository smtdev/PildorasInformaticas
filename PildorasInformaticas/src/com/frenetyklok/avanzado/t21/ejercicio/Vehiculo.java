package com.frenetyklok.avanzado.t21.ejercicio;

public class Vehiculo {
	
	private int idVehiculo;
	private String tipo;
	
	public Vehiculo(int idVehiculo, String tipo){
		this.idVehiculo = idVehiculo;
		this.tipo = tipo;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public String getTipo() {
		return tipo;
	}
	
	@Override
	public String toString(){
		return "Vehículo ID-> " + this.idVehiculo + ". Tipo: " + this.tipo;
	}

}
