package com.frenetyklok.aprenderaprogramar.video87.ejercicio;

import java.util.Calendar;

public class TestProductos {

	public static void main(String[] args) {
		
		Calendar fechaEnvasado = Calendar.getInstance();
		Calendar fechaCaducidad = Calendar.getInstance();
		
		fechaEnvasado.set(2017, 1, 1);
		fechaCaducidad.set(2020, 11, 31, 12, 1, 1);
		
		System.out.println("Este es el tiempo de caducidad en milisegundos:");
		
		System.out.println(fechaCaducidad.getTime());//como pasar esto a milisegundos.cuando lo intento me da valores diferentees
		
		System.out.println();
		
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
		
		System.out.println("Hacemos algunas pruebas con herencias...");
		
		/*
		 * EL SIGUIENTE OBJETO NO TIENE LOS METODOS PROPIOS DE REFRIGERADO
		 * PERO SI LO IMPRIMIMOS SI QUE USA TOSTRING DEFINIDO PARA REFRIGERADO
		 * ESTO ES ASÍ PORQUE LA SUPERCLASE ADMITE TOSTRING PERO EN EJECUCIÓN 
		 * SE BUSCA LA IMPLEMENTACION MAS CONCRETA, QUE EN ESTE CASO ES LA
		 * DE LA SUBCLASE
		 * APARECE TODA LA INFORMACION PORQUE AUNQUE NO ES ACCESIBLE CON LOS SET Y GET
		 * DE LA SUPERCLASE, LOS PARAMETROS PROPIOS DE LA SUBCLASE SIGUEN ESTANDO GUARDADOS
		 * EN EL OBJETO. PRODUCTO PRUEBA APUNTA A ESE OBJETO AUNQUE NO TIENE METODOS PARA
		 * ACTUAR O RECUPERAR ESOS PARAMETROS ESPECIFICOS DE LA SUBCLASE
		 */
		
		Producto productoPrueba = new ProductoRefrigerado(fechaCaducidad, 111, fechaEnvasado, "Madagascar", 111, "PDM");
		System.out.println(productoPrueba);
		/*
		 * POR OTRO LADO SI HACEMOS UN CASTING SI QUE ESTARAN ACCESIBLE LOS METODOS
		 */
		
		
		ProductoRefrigerado productoCasteado = (ProductoRefrigerado) productoPrueba;
		productoCasteado.setCodigoSupervision("RDF");
		System.out.println(productoCasteado);
		
		System.out.println("sigue estando productoPrueba?");//VEMOS QUE NO PORQUE APUNTA AL MISMO OBJETO QUE CASTEADO Y LE HEMOS CAMBIADO EL CODIGO
		System.out.println(productoPrueba);
	}

}
