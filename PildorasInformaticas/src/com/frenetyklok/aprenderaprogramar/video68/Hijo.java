package com.frenetyklok.aprenderaprogramar.video68;

public class Hijo{
	private Padre padre;
	private Abuelo abuelo;
	
	public Hijo(){
		this.padre = new Padre("Pablo", 38);
		this.abuelo = new Abuelo("Juan", 75);
	}
	
	public String getNombrePadre(){
		return this.padre.getNombre();
	}
	public String getNombreAbuelo(){
		return this.abuelo.getNombre();
	}
}
