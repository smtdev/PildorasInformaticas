package com.frenetyklok.aprenderaprogramar.video68;

import java.util.ArrayList;

public class ListaNumeros {
	
	private ArrayList<Integer> listaDeNumeros;
	
	public ListaNumeros(){
		this.listaDeNumeros = new ArrayList<Integer>();//si no añadimos esta línea nos vamos al primer caso del if
	}
	
	/*public Integer sumatorio(){
		Integer suma = 0;
		
		for(Integer numero: listaDeNumeros){
			suma = suma + numero;
		}
		return suma;
	}*/
	
	public Integer sumatorio(){
		Integer suma = 0;
		
		if(listaDeNumeros == null){
			System.out.println("La variable listaDeNumeros no apunta a ningún espacio de memoria!");
		}else{
			System.out.println("La variable listaDeNumeros sí apunta a un espacio determinado de memoria!");
		}
		return suma;
	}
	
	 
	
	
	public void anadirItem(Integer item){
		listaDeNumeros.add(item);
	}

}
