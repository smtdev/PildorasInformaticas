package com.frenetyklok.video51.InterfacesYClasesInternasIII;

public interface Trabajadores {
	
	public abstract double estableceBonus(double gratificacion);// no se suele indicar public abstract
	
	//cramos una constante
	//recuerdo que las interfaces no pueden tener variables
	public static final double bonusBase = 1500; //no es necesario poner public static final

}
