package com.frenetyklok.aprenderaprogramar.video87.ejercicio;

import java.util.ArrayList;

public class EnvioDeProductos {
	
	private ArrayList<Producto> envioProductos;
	
	public EnvioDeProductos(ArrayList<Producto> envioProductos){
		this.envioProductos = envioProductos;
	}

	public ArrayList<Producto> getEnvioProductos() {
		return envioProductos;
	}

	public void setEnvioProductos(ArrayList<Producto> envioProductos) {
		this.envioProductos = envioProductos;
	}
	
	@Override
	public String toString(){
		return this.envioProductos.toString();
	}

}
