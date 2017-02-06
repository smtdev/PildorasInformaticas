package com.frenetyklok.aprenderaprogramar.video87.ejercicio;

import java.util.Calendar;

public class ProductoCongeladoAgua extends ProductoConservadoFrio {
	
	private int salinidad;

	public ProductoCongeladoAgua(Calendar fechaCaducidad, int numeroLote, Calendar fechaEnvasado, String paisOrigen,
			int temperaturaMantenimiento, int salinidad) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
		this.salinidad = salinidad;
	}

	public int getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(int salinidad) {
		this.salinidad = salinidad;
	}

	@Override
	public String toString() {
		return super.toString() + "ProductoCongeladoAgua [salinidad=" + salinidad + "]";
	}
	
	

}
