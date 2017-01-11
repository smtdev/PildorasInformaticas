package com.frenetyklok.aprenderaprogramar.tema41;

public class SalonCasa {
	
	private int numeroDeTelevisores;
	private String tipoSalon;
	
	public SalonCasa(){
		this.numeroDeTelevisores = 0;
		this.tipoSalon = "desconocido";
	}
	
	public int getNumeroTelevisores(){
		return numeroDeTelevisores;
	}
	
	public String getTipoSalon(){
		return tipoSalon;
	}

}
