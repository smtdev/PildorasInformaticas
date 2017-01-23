package com.frenetyklok.aprenderaprogramar.video67;

import java.util.Iterator;
import java.util.ArrayList;

public class TestUsoIterator {
	
	public static void main(String[] args){
		
		ArrayList<String> listaDeNombres = new ArrayList<String>();
		listaDeNombres.add("Juan");
		listaDeNombres.add("José Alberto");
		listaDeNombres.add("Perico Los Palotes");
		
		String cadenaBuscar = "Alberto";
		
		System.out.println("La cadena que buscamos es: " + cadenaBuscar);
		
		//creamos el objeto de tipo iterator con String
		Iterator<String> it = listaDeNombres.iterator();
		
		String tmpAnalizado;
		
		while(it.hasNext()){
			tmpAnalizado = it.next();
			System.out.println("Analizando elemento: " + tmpAnalizado);
			
			if(tmpAnalizado.contains(cadenaBuscar)){
				System.out.println("Cadena encontrada!");
				it.remove();//borramos la últimao objeto devuleto por next() en la coleccion original (en el ArrayList en este caso)
				break;//para salir del bucle
			}else{
				//vacio
			}
		}
		
		for(String nombre: listaDeNombres){
			System.out.println(nombre);
		}
		
		
		
		
	}

}
