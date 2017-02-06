package com.frenetyklok.aprenderaprogramar.video87.ejercicio;

import java.util.Arrays;
import java.util.Calendar;

public class ProductoCongeladoAire extends ProductoConservadoFrio {
	
	private int[] composicion;

	public ProductoCongeladoAire(Calendar fechaCaducidad, int numeroLote, Calendar fechaEnvasado, String paisOrigen,
			int temperaturaMantenimiento, int[] composicion) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
		this.composicion = composicion;
	}

	public int[] getComposicion() {
		return composicion;
	}

	public void setComposicion(int[] composicion) {
		this.composicion = composicion;
	}

	@Override
	public String toString() {
		return super.toString() + "ProductoCongeladoAire [composicion=" + Arrays.toString(composicion) + "]";
	}
	
	

}
