package com.frenetyklok.aprenderaprogramar.video86;

public class ProductoRefrigerado extends Producto {
	
	private int codigoSupervision;

	public ProductoRefrigerado(String fechaCaducidad, int numeroLote, int codigoSupervision) {
		super(fechaCaducidad, numeroLote);
		this.codigoSupervision = codigoSupervision;
	}

	public int getCodigoSupervision() {
		return codigoSupervision;
	}

	public void setCodigoSupervision(int codigoSupervision) {
		this.codigoSupervision = codigoSupervision;
	}

	@Override
	public String muestraProducto() {
		
		return super.muestraProducto() + " Código de supervisión: " + this.getCodigoSupervision();
	}
	
	

}
