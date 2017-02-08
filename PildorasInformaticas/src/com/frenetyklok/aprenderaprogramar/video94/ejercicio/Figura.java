package com.frenetyklok.aprenderaprogramar.video94.ejercicio;

public class Figura {
	
	private double dimensionPrincipal;
	
	public Figura(){}
	
	public void setDimensionPrincipal(double dimensionPrincipal){
		this.dimensionPrincipal = dimensionPrincipal;
	}
	
	public double getDimensionPrincipal(){
		return this.dimensionPrincipal;
	}
	
	@Override
	public boolean equals(Object objeto){
		if(objeto instanceof Figura){
			
			Figura tmpFigura = (Figura) objeto;
			
			if(this.dimensionPrincipal == tmpFigura.dimensionPrincipal){
				return true;
			}else {return false;}
		}else {return false;}
	}
	
	

}
