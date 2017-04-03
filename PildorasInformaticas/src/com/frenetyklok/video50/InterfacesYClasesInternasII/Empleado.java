package com.frenetyklok.video50.InterfacesYClasesInternasII;

public class Empleado implements Comparable<Empleado>{
	
	private String nombre;
	private double sueldo;
	private int agno;
	private int mes;
	private int dia;
	
	public Empleado(String nombre, double sueldo, int agno, int mes, int dia){
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.agno = agno;
		this.mes = mes;
		this.dia = dia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", agno=" + agno + ", mes=" + mes + ", dia=" + dia
				+ "]";
	}

	@Override
	public int compareTo(Empleado otroEmpleado) {
		
		return (int) (this.getSueldo() - otroEmpleado.getSueldo());
		
	}
	
	

}
