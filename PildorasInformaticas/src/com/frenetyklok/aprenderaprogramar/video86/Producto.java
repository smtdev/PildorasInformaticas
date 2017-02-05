package com.frenetyklok.aprenderaprogramar.video86;

public class Producto {
	
	private String fechaCaducidad;
	private int numeroLote;
	
	
	public Producto(String fechaCaducidad, int numeroLote) {
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}


	public String getFechaCaducidad() {
		return fechaCaducidad;
	}


	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}


	public int getNumeroLote() {
		return numeroLote;
	}


	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	
	public String muestraProducto(){
		return "Fecha de caducidad: " + this.getFechaCaducidad() + ". Número de Lote: " + this.getNumeroLote() + "."; 
	}

}
