package com.frenetyklok.avanzado.t20;

public class Cuadrupedo {
	
	private int idCuadrupedo;
	private String tipo;
	
	public Cuadrupedo(int idCuadrupedo, String tipo){
		this.idCuadrupedo = idCuadrupedo;
		this.tipo = tipo;
	}

	public int getIdCuadrupedo() {
		return idCuadrupedo;
	}

	public String getTipo() {
		return tipo;
	}
	
	@Override
	public String toString(){
		return "Cuadrúpedo-> ID: " + this.idCuadrupedo + " Tipo: " + this.tipo; 
	}

}
