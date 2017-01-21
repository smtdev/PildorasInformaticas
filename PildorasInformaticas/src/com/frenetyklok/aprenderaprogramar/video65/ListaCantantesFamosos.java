package com.frenetyklok.aprenderaprogramar.video65;

import java.util.ArrayList;

public class ListaCantantesFamosos {
	
	private ArrayList<String> nombresCantantes;
	
	public ListaCantantesFamosos(){
		this.nombresCantantes = new ArrayList<String>();
		nombresCantantes.add("Pablo");
		nombresCantantes.add("Pedro");
		nombresCantantes.add("Juan");
	}
	
	public String getCantante(int indice){
		return nombresCantantes.get(indice);
	}
	
	public void addNombre(String nombre){
		this.nombresCantantes.add(nombre);
	}
	
	public int getTamano(){
		return nombresCantantes.size();
	}
	
	public ArrayList<String> getLista(){
		return this.nombresCantantes;
	}
	

}
