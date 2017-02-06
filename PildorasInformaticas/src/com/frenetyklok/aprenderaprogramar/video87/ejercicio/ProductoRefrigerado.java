package com.frenetyklok.aprenderaprogramar.video87.ejercicio;

import java.util.Calendar;

public class ProductoRefrigerado extends ProductoConservadoFrio{
	
	private String codigoSupervision;

	public ProductoRefrigerado(Calendar fechaCaducidad, int numeroLote, Calendar fechaEnvasado, String paisOrigen,
			int temperaturaMantenimiento, String codigoSupervision) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
		this.codigoSupervision = codigoSupervision;
	}

	public String getCodigoSupervision() {
		return codigoSupervision;
	}

	public void setCodigoSupervision(String codigoSupervision) {
		this.codigoSupervision = codigoSupervision;
	}

	@Override
	public String toString() {
		return super.toString() + "ProductoRefrigerado [codigoSupervision=" + codigoSupervision + "]";
	}

}
