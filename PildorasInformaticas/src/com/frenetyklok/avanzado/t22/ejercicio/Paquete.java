package com.frenetyklok.avanzado.t22.ejercicio;

public class Paquete {
	
	private int idPaquete;
	private int pesoPaquete;
	
	public Paquete(int idPaquete, int pesoPaquete){
		this.idPaquete = idPaquete;
		this.pesoPaquete = pesoPaquete;
	}
	
	
	
	public int getPesoPaquete() {
		return pesoPaquete;
	}



	@Override
	public String toString(){
		return "Paquete-> ID: " + this.idPaquete + " Peso: " + this.pesoPaquete;
	}

}
