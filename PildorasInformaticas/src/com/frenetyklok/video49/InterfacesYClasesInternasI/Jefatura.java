package com.frenetyklok.video49.InterfacesYClasesInternasI;

public class Jefatura extends Empleado {
	
	private double incentivo;
	
	public Jefatura(String nombre, double sueldo, int agno, int mes, int dia){
		super(nombre, sueldo, agno, mes, dia);
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	
	
	
	@Override
	public double getSueldo() {
		// TODO Auto-generated method stub
		return super.getSueldo() + incentivo;
	}

	@Override
	public String toString(){
		return "Jefatura-> Nombre: " + this.getNombre() + " Sueldo: " + this.getSueldo() + 
				" Antiguedad: " + this.getAgno() + "/" + this.getMes() + "/" + this.getDia() + 
				" Incentivo: " + this.incentivo;
	}

	
	
	

}
