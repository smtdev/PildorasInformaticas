package com.frenetyklok.avanzado.t19;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPersonas implements Iterable<Persona>{
	
	private ArrayList<Persona> listaPersonas = null;
	
	public ListaPersonas(){
		this.listaPersonas = new ArrayList<Persona>();
	}
	
	public ArrayList<Persona> getListaPersonas() { return this.listaPersonas;}
	
	@Override
	public String toString(){
		return listaPersonas.toString();
	}
	
	public Iterator<Persona> iterator(){
		return new MiIteradorListaPersonas();
	}
	
	protected class MiIteradorListaPersonas implements Iterator<Persona>{
		
		public int posicion = 0;
		public boolean esEliminable = false;
		
		@Override
		public boolean hasNext(){
			return posicion < listaPersonas.size();
		}
		
		@Override
		public Persona next(){
			Persona res = listaPersonas.get(posicion);
			posicion++;
			esEliminable = true;
			return res;
		}
		
		@Override
		public void remove(){
			if(esEliminable){
				listaPersonas.remove(posicion - 1);
				posicion--; //el elemento actual pasa a estar colocado una posición antes al elimianr el anterior
				esEliminable = false; //ya que no se puede eliminar un objeto si no se ha hecho next sobre él
			}
		}
		
	}

}
