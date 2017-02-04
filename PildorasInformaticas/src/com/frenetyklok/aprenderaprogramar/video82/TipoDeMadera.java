package com.frenetyklok.aprenderaprogramar.video82;

public enum TipoDeMadera {
	
	ROBLE("Castaño verdoso", 800),
	CAOBA("Marrón oscuro", 770),
	NOGAL("Marrón rojizo", 820),
	CEREZO("Marrón cereza", 790),
	BOJ("Marrón negruzco", 675);
	
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
