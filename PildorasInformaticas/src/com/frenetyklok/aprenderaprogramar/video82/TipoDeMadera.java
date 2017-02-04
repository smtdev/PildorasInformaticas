package com.frenetyklok.aprenderaprogramar.video82;

public enum TipoDeMadera {
	
	ROBLE("Casta�o verdoso", 800),
	CAOBA("Marr�n oscuro", 770),
	NOGAL("Marr�n rojizo", 820),
	CEREZO("Marr�n cereza", 790),
	BOJ("Marr�n negruzco", 675);
	
	//campos de tipo constante
	
	private final String color;
	private final int pesoEspecifico;
	
	TipoDeMadera(String color, int pesoEspecifico) {
		
		this.color = color;
		this.pesoEspecifico = pesoEspecifico;
		
	}
	
	public String getColor(){return this.color;}
	public int getPesoEspecifico(){return this.pesoEspecifico;}
	
}
