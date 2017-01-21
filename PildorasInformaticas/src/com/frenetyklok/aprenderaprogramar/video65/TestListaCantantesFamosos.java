package com.frenetyklok.aprenderaprogramar.video65;
import com.frenetyklok.aprenderaprogramar.video61.*;

public class TestListaCantantesFamosos {

	public static void main(String[] args) {

		ListaCantantesFamosos lcf = new ListaCantantesFamosos();
		
		System.out.println("Programa para guardar nombres de cantantes famosos");
		
		System.out.println("Por favor, introduzca el nombre de un cantante famoso");
		EntradaDeTeclado entrada1 = new EntradaDeTeclado();
		
		System.out.println("Por favor, introduzca el nombre de otro cantante famoso");
		EntradaDeTeclado entrada2 = new EntradaDeTeclado();
		
		lcf.addNombre(entrada1.getEntrada());
		lcf.addNombre(entrada2.getEntrada());
		
		System.out.println("Los nombres de cantantes famosos que están en la lista son:");
		
		for(int i = 0; i < lcf.getTamano(); i++){
			System.out.println(lcf.getCantante(i));
		}

	}

}
