package com.frenetyklok.avanzado.t19;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPersonas implements Iterable<Persona>{
	
	private ArrayList<Persona> listaPersonas;
	
	public ListaPersonas(){
		this.listaPersonas = new ArrayList<Persona>();
	}
	
	public ArrayList<Persona> getListaPersonas() { return this.listaPersonas;}
	
	@Override
	public String toString(){
		return this.listaPersonas.toString();
	}
	
	public Iterator<Persona> iterator(){
		return new MiIteradorListaPersonas();
	}
	
	protected class MiIteradorListaPersonas implements Iterator<Persona>{
		
		private int posicion = 0;
		private boolean borrable = false;
		
		@Override
		public boolean hasNext() {
			return posicion < listaPersonas.size();
		}
		
		@Override
		public Persona next() {
			Persona persona = listaPersonas.get(posicion);
			posicion++;
			borrable = true;
			return persona;
		}
		
		@Override
		public void remove() {
			
			if(borrable){
				listaPersonas.remove(posicion - 1);
				posicion--;
				borrable = false;
			}
			
		}
		
		
		
	}
	
}
