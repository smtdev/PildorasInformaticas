package com.frenetyklok.avanzado.t24.ejercicio;

import java.util.Objects;

public class Hotel implements Comparable<Hotel>{
	
	private int idHotel;
	private String zona;
	private int precio;
	
	public Hotel(int idHotel, String zona, int precio){
		this.idHotel = idHotel;
		this.zona = zona;
		this.precio = precio;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public String getZona() {
		return zona;
	}

	public int getPrecio() {
		return precio;
	}
	
	@Override
	public String toString(){
		return "Hotel-> ID: " + this.idHotel + " Zona: " + this.zona + " Precio: " + this.precio + "\n";
	}
	
	@Override
	public int compareTo(Hotel o){
		return this.precio - o.precio;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == null){return false;}
		if(this.getClass() != o.getClass()) { return false;}
		final Hotel other = (Hotel) o;
		if(this.idHotel != other.idHotel){return false;}
		if(!Objects.equals(this.zona, other.zona)) {return false;}
		if(this.precio != other.precio){return false;}
		return true;
	}

}
