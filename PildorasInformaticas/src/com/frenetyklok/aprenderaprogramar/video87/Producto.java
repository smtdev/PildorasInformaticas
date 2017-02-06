package com.frenetyklok.aprenderaprogramar.video87;

import java.util.Calendar;

public class Producto {
	
	private Calendar fechaCaducidad;
	private int numeroLote;
	private Calendar fechaEnvasado;
	private String paisOrigen;
	
	
	public Producto(Calendar fechaCaducidad, int numeroLote, Calendar fechaEnvasado, String paisOrigen) {

		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}


	public Calendar getFechaCaducidad() {
		return fechaCaducidad;
	}


	public void setFechaCaducidad(Calendar fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}


	public int getNumeroLote() {
		return numeroLote;
	}


	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}


	public Calendar getFechaEnvasado() {
		return fechaEnvasado;
	}


	public void setFechaEnvasado(Calendar fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}


	public String getPaisOrigen() {
		return paisOrigen;
	}


	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}


	@Override
	public String toString() {
		return "Producto [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + ", fechaEnvasado="
				+ fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
	}
	
	
	
	
	
	
	

}
