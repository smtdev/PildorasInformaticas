package com.frenetyklok.aprenderaprogramar.video65;

import java.util.ArrayList;

public class ListaNombres {
	
	private String nombreDeLaLista;
	private ArrayList<String> listaDeNombres;
	
	public ListaNombres(String nombre){
		this.nombreDeLaLista = nombre;
		listaDeNombres = new ArrayList<String>();
	}
	
	public void addNombre(String valorNombre){
		listaDeNombres.add(valorNombre);
	}
	
	public String getNombre(int posicion){
		
		if(posicion >= 0 && posicion < listaDeNombres.size()){
			return listaDeNombres.get(posicion);
		}else{
			return "No existe nombre para la posición solicitada";
		}
		
	}
	
	public int getTamano(){
		return listaDeNombres.size();
	}
	
	public void removeNombre(int posicion){
		
		if(posicion >= 0 && posicion < listaDeNombres.size()){
			listaDeNombres.remove(posicion);
		}else{
			//vacio
		}
	}
	

}
