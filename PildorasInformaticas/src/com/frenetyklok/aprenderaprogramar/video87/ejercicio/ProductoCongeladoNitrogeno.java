package com.frenetyklok.aprenderaprogramar.video87.ejercicio;

import java.util.Calendar;

public class ProductoCongeladoNitrogeno extends ProductoConservadoFrio {
	
	private String metodo;
	private int tiempo;
	
	public ProductoCongeladoNitrogeno(Calendar fechaCaducidad, int numeroLote, Calendar fechaEnvasado,
			String paisOrigen, int temperaturaMantenimiento, String metodo, int tiempo) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
		this.metodo = metodo;
		this.tiempo = tiempo;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return super.toString() + "ProductoCongeladoNitrogeno [metodo=" + metodo + ", tiempo=" + tiempo + "]";
	};
	
	
	
	

}
