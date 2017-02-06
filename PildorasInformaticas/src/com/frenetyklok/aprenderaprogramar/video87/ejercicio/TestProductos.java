package com.frenetyklok.aprenderaprogramar.video87.ejercicio;

import java.util.Calendar;

public class TestProductos {

	public static void main(String[] args) {
		
		Calendar fechaEnvasado = Calendar.getInstance();
		Calendar fechaCaducidad = Calendar.getInstance();
		
		fechaEnvasado.set(2017, 1, 1);
		fechaCaducidad.set(2020, 12, 31);
		
		Producto producto = new Producto(fechaCaducidad, 1, fechaEnvasado, "España");
		System.out.println(producto);
		
		System.out.println();
		
		ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado(fechaCaducidad, 2, fechaEnvasado, "Francia", 5, "RD123");
		System.out.println(productoRefrigerado);
		
		System.out.println();
		
		ProductoCongeladoAgua pCAgua = new ProductoCongeladoAgua(fechaCaducidad, 3, fechaEnvasado, "Perú", 2, 8);
		System.out.println(pCAgua);
		
		System.out.println();
		
		ProductoCongeladoNitrogeno pCNitrogeno = new ProductoCongeladoNitrogeno(fechaCaducidad, 98, fechaEnvasado, "Alemania", 1, "elquesea", 23);
		System.out.println(pCNitrogeno);
		
		System.out.println();
		
		int[] composicion = { 1,2,34,5,5};
		ProductoCongeladoAire pCA = new ProductoCongeladoAire(fechaCaducidad, 11, fechaEnvasado, "Jamaica", 23, composicion);
		System.out.println(pCA);
	}

}
