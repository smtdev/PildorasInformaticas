package com.frenetyklok.aprenderaprogramar.video82;

public enum TipoDeMineral {
	
	CALIZA(1200f),
	MARMOL(1423.55f),
	PIZARRA(1325f),
	CUARZITA(1466.22f);
	
	private float pesoEspecifico;
	
	TipoDeMineral(float pesoEspecifico) {
		this.pesoEspecifico = pesoEspecifico;
	}
	
	public float getPesoEspecifico(){return this.pesoEspecifico;}

}
