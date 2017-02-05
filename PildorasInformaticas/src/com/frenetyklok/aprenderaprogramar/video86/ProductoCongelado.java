package com.frenetyklok.aprenderaprogramar.video86;

public class ProductoCongelado extends Producto {
	
	private int temperaturaCongelacion;
	
	public ProductoCongelado(String fechaCaducidad, int numeroLote, int temperaturaCongelacion){
		super(fechaCaducidad, numeroLote);
		this.temperaturaCongelacion = temperaturaCongelacion;
	}
	
	public int getTemperaturaCongelacion(){
		return this.temperaturaCongelacion;
	}
	
	public void setTemperaturaCongelacion(int temperaturaCongelacion){
		this.temperaturaCongelacion = temperaturaCongelacion;
	}
	
	@Override
	public String muestraProducto(){
		return super.muestraProducto() + " Temperatura de congelaci�n: " + this.getTemperaturaCongelacion();
	}

}
