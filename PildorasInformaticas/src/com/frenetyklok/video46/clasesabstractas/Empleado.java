package com.frenetyklok.video46.clasesabstractas;

public class Empleado extends Persona {
	
	private double sueldo;
	private int agno;
	private int mes;
	private int dia;
	
	public Empleado(String nombre, double sueldo, int agno, int mes, int dia){
		super(nombre);
		this.sueldo = sueldo;
		this.agno = agno;
		this.mes = mes;
		this.dia = dia;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getAgno() {
		return agno;
	}

	public void setAgno(int agno) {
		this.agno = agno;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "Empleado [nombre= " + this.getNombre() + " sueldo=" + sueldo + ", agno=" + agno + ", mes=" + mes + ", dia=" + dia
				+ "]";
	}
	
	
	//LA SIGUIENTE SE IMPLEMENTA POR HEREDAR DE UNA CLASE ABSTRACTA CON ESTE METODO ABSTRACTO
	//EN SI DEVUELVE LO MISMO QUE TOSTRING PERO LO USAMOS PARA VER LA FUNCIONALIDAD DE 
	//LAS CLASES ABSTRACTAS
	public String dameDescripcion(){
		return "Empleado [sueldo=" + sueldo + ", agno=" + agno + ", mes=" + mes + ", dia=" + dia
				+ "]";
	}

}
