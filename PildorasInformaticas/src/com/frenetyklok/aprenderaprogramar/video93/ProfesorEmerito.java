package com.frenetyklok.aprenderaprogramar.video93;

public class ProfesorEmerito extends Profesor {
	
	private int anosEmerito;

	public ProfesorEmerito(String nombre, int edad, int anosConsolidados, int anosEmerito) {
		super(nombre, edad, anosConsolidados);
		this.anosEmerito = anosEmerito;
	}

	public int getAnosEmerito() {
		return anosEmerito;
	}

	public void setAnosEmerito(int anosEmerito) {
		this.anosEmerito = anosEmerito;
	}
	
	public double obtenerSalarioBase(){
		return 925 + this.anosConsolidados * 33.25 + 47.80 * this.anosEmerito;
	}

}
