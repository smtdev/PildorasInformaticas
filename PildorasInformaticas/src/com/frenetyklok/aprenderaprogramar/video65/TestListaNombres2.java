package com.frenetyklok.aprenderaprogramar.video65;
import com.frenetyklok.aprenderaprogramar.video61.*;

public class TestListaNombres2 {

	public static void main(String[] args) {

		System.out.println("Empezamos el programa");
		
		System.out.println("Por favor, introduzca el nombre 1: ");
		EntradaDeTeclado entrada1 = new EntradaDeTeclado();
		
		System.out.println("Por favor, introduzca el nombre 2: ");
		EntradaDeTeclado entrada2 = new EntradaDeTeclado();
		
		System.out.println("Por favor, introduzca el nombre 3: ");
		EntradaDeTeclado entrada3 = new EntradaDeTeclado();
		
		System.out.println("Gracias!");
		
		ListaNombres lista1 = new ListaNombres("Nombres introducidos por usuario");
		
		lista1.addNombre(entrada1.getEntrada());
		lista1.addNombre(entrada2.getEntrada());
		lista1.addNombre(entrada3.getEntrada());
		
		System.out.println("La lista ha quedado formada por " + lista1.getTamano() + " elementos.");
		
		System.out.println("Elemento 1: " + lista1.getNombre(0));
		System.out.println("Elemento 2: " + lista1.getNombre(1));
		System.out.println("Elemento 3: " + lista1.getNombre(2));
		

	}

}
