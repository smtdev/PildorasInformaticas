package com.frenetyklok.aprenderaprogramar.video87.ejercicio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class TestProductos2 {
	
	public static void main(String[] args){
		
		Calendar fechaEnvasado = Calendar.getInstance();
		Calendar fechaCaducidad = Calendar.getInstance();
		
		fechaEnvasado.set(2017, 1, 1);
		fechaCaducidad.set(2020, 11, 31, 12, 1, 1);
		
		Producto producto1 = new Producto(fechaCaducidad, 1, fechaEnvasado, "España");
		Producto producto2 = new Producto(fechaCaducidad, 1, fechaEnvasado, "España");
		
		ProductoRefrigerado pRefrigerado1 = new ProductoRefrigerado(fechaCaducidad, 2, fechaEnvasado, "Francia", 5, "PDM");
		ProductoRefrigerado pRefrigerado2 = new ProductoRefrigerado(fechaCaducidad, 21, fechaEnvasado, "Francia", 5, "PDM");
		ProductoRefrigerado pRefrigerado3 = new ProductoRefrigerado(fechaCaducidad, 22, fechaEnvasado, "Francia", 5, "PDM");
		
		ProductoCongeladoAgua pCAgua1 = new ProductoCongeladoAgua(fechaCaducidad, 3, fechaEnvasado, "Alemania", 4, 9);
		ProductoCongeladoAgua pCAgua2 = new ProductoCongeladoAgua(fechaCaducidad, 31, fechaEnvasado, "Alemania", 4, 9);
		
		int[] composicion = { 1,2,34,5,5};
		
		ProductoCongeladoAire pCAire1 = new ProductoCongeladoAire(fechaCaducidad, 4, fechaEnvasado, "Inglaterra", 3, composicion);
		ProductoCongeladoAire pCAire2 = new ProductoCongeladoAire(fechaCaducidad, 41, fechaEnvasado, "Inglaterra", 3, composicion);
		
		ProductoCongeladoNitrogeno pCNitrogeno1 = new ProductoCongeladoNitrogeno(fechaCaducidad, 5, fechaEnvasado, "Italia", 2, "ESR", 98);
		
		
		
		ArrayList<Producto> envio = new ArrayList<Producto>();
		envio.add(producto1);
		envio.add(producto2);
		envio.add(pRefrigerado1);
		envio.add(pRefrigerado2);
		envio.add(pRefrigerado3);
		envio.add(pCAgua1);
		envio.add(pCAgua2);
		envio.add(pCAire1);
		envio.add(pCAire2);
		envio.add(pCNitrogeno1);
		
		//EnvioDeProductos envio1 = new EnvioDeProductos(envio);
		//si ponemros lo anterior tenemos que modificar la siguiente linea como envio1.getEvioProductos().iterator()
		
		Iterator<Producto> it = envio.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
		
		
	}

}
