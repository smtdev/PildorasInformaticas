package com.frenetyklok.aprenderaprogramar.video65;
import com.frenetyklok.aprenderaprogramar.video61.*;

import java.util.ArrayList;

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
		
		/*for(int i = 0; i < lcf.getTamano(); i++){
			System.out.println(lcf.getCantante(i));
		}*/
		
		//veamos como se puede hacer con un blucle for extendido
		
		ArrayList<String> listaCantantes = new ArrayList<String>();
		listaCantantes = lcf.getLista();
		
		for(String nombre: listaCantantes){
			System.out.println(nombre);
		}

	}

}
