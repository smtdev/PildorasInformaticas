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
	
	//ES MEJOR CREAR UN METODO PARA AÑADIR OBJETOS AL OBJETO DE TIPO ENVIODEPRODUCTOS
	//QUE TENER QUE CREAR EL ARRAYLIST PARA LUEGO CREAR EL OBJETO CON EL
	//DE ESTA FORMA PODEMOS VARIAR EL OBJETO SIN TENER QUE REDEFINIR EL ARRRAY PARA VOLVER A PASARLO 
	//PARA CAMBIAR EL OBJETO DE TIPO ENVIODEPRODUCTOS
	
	public void addProducto(Producto producto){
		envioProductos.add(producto);
	}

}
