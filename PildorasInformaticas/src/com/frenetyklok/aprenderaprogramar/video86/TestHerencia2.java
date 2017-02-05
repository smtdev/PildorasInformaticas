package com.frenetyklok.aprenderaprogramar.video86;

public class TestHerencia2 {
	
	public static void main(String[] args){
		
		Producto producto = new Producto("22112010", 987);
		ProductoFresco productoFresco = new ProductoFresco("21122017", 789, "21122016", "Spain");
		ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado("11102016", 123, 777);
		ProductoCongelado productoCongelado = new ProductoCongelado("17061975", 111, 0);
		
		System.out.println(producto.muestraProducto());
		System.out.println(productoFresco.muestraProducto());
		System.out.println(productoRefrigerado.muestraProducto());
		System.out.println(productoCongelado.muestraProducto());
		
		
	}

}
