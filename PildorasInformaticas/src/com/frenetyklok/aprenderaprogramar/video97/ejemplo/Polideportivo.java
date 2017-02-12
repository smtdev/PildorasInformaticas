package com.frenetyklok.aprenderaprogramar.video97.ejemplo;

public class Polideportivo implements InstalacionDeportiva, Edificio {
	
	private int tipoInstalacion;
	private double superficieEdificio;
	
	public Polideportivo(int tipoInstalacion, double superficieEdificio){
		this.superficieEdificio = superficieEdificio;
		this.tipoInstalacion = tipoInstalacion;
	}
	

	@Override
	public double getSuperficieEdificio() {
		return this.superficieEdificio;
	}

	@Override
	public int getTipoDeInstalacion() {
		return this.tipoInstalacion;
	}


	@Override
	public String toString() {
		return "Polideportivo [tipoInstalacion=" + tipoInstalacion + ", superficieEdificio=" + superficieEdificio + "]";
	}
	
	
}
