package com.frenetyklok.aprenderaprogramar.video86;

public class ProductoFresco extends Producto{
	
	private String fechaEnvasado;
	private String paisOrigen;
	
	
	public ProductoFresco(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}


	public String getFechaEnvasado() {
		return fechaEnvasado;
	}


	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}


	public String getPaisOrigen() {
		return paisOrigen;
	}


	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}


	@Override
	public String muestraProducto() {
		
		return super.muestraProducto() + " Fecha de envasado: " + this.getFechaEnvasado() +
				". Pa�s de origen: " + this.getPaisOrigen();
	}
	
	
	
	

}
