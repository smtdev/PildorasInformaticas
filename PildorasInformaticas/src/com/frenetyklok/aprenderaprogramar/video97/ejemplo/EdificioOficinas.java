package com.frenetyklok.aprenderaprogramar.video97.ejemplo;

public class EdificioOficinas implements Edificio {
	
	private int numeroOficinas;
	private double superficie;
	
	public EdificioOficinas(int numeroOficinas, double superficie) {
		this.numeroOficinas = numeroOficinas;
		this.superficie = superficie;
	}
	
	public int getNumeroOficinas() {
		return numeroOficinas;
	}


	@Override
	public double getSuperficieEdificio() {
		return this.superficie;
	}
	
	@Override
	public String toString(){
		return "Edificio de oficinas con " + this.getSuperficieEdificio() + " y " + this.getNumeroOficinas()
			+ " oficinas";
	}

}
