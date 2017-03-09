package com.frenetyklok.avanzado.t17;

import java.util.ArrayList;
import java.util.Collection;

public class ProgramaColeccionesArrayList {
	
	public static void main(String[] args){
		Collection<String> listaMarcaCoches = new ArrayList<String>();
		listaMarcaCoches.add("Audi");
		listaMarcaCoches.add("Porsche");
		listaMarcaCoches.add("Aston Martin");
		listaMarcaCoches.add("Ferrari");
		listaMarcaCoches.add("Mercedes");
		listaMarcaCoches.add("Seat");
		
		System.out.println("Número de elementos antes de eliminar: " + listaMarcaCoches.size());
		System.out.println(listaMarcaCoches.toString());
		listaMarcaCoches.remove("Seat");
		listaMarcaCoches.remove("Porsache");//si no escribimos bien no elimina
		
		System.out.println("Número de elementos tras eliminaciones: " + listaMarcaCoches.size());
		System.out.println(listaMarcaCoches.toString());
		
		
	}

}
