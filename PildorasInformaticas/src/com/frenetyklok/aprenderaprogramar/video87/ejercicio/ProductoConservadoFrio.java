package com.frenetyklok.aprenderaprogramar.video87.ejercicio;

import java.util.Calendar;

public class ProductoConservadoFrio extends Producto{
	
	private int temperaturaMantenimiento;

	public ProductoConservadoFrio(Calendar fechaCaducidad, int numeroLote, Calendar fechaEnvasado, String paisOrigen,
			int temperaturaMantenimiento) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}

	public int getTemperaturaMantenimiento() {
		return temperaturaMantenimiento;
	}

	public void setTemperaturaMantenimiento(int temperaturaMantenimiento) {
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}

	@Override
	public String toString() {
		return super.toString() + "ProductoConservadoFrio [temperaturaMantenimiento=" + temperaturaMantenimiento + "]";
	}


	
}
