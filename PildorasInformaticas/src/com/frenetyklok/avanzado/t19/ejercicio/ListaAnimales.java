package com.frenetyklok.avanzado.t19.ejercicio;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaAnimales implements Iterable<Animal> {
	
	private ArrayList<Animal> listaAnimales;
	
	public ListaAnimales(){
		this.listaAnimales = new ArrayList<Animal>();
	}
	
	public ArrayList<Animal> getListaAnimales(){ return this.listaAnimales;}
	
	@Override
	public String toString(){
		return this.listaAnimales.toString();
	}
	
	@Override
	public Iterator<Animal> iterator(){
		return new MiIteradorAnimales();
	}
	
	protected class MiIteradorAnimales implements Iterator<Animal>{
		private int posicion;
		private boolean borrable;
		
		@Override
		public boolean hasNext(){
			return posicion < listaAnimales.size();
		}
		
		@Override
		public Animal next(){
			Animal animal = listaAnimales.get(posicion);
			posicion++;
			borrable = true;
			return animal;
		}
		
		@Override
		public void remove(){
			if(borrable){
				listaAnimales.remove(posicion - 1);
				posicion--;
				borrable = false;
			}
		}
	}

}
