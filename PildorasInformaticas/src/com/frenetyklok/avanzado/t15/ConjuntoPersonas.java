package com.frenetyklok.avanzado.t15;

import java.util.Iterator;

public class ConjuntoPersonas implements Iterable<Persona> {
	
	private Persona[] conjuntoPersonas;
	
	public ConjuntoPersonas(Persona[] conjuntoPersonas){
		this.conjuntoPersonas = conjuntoPersonas;
	}
	
	public Iterator<Persona> iterator(){
		Iterator<Persona> it = new MiIteratorPersona();
		return it;
	}
	
	
	
	public Persona[] getConjuntoPersonas() {
		return conjuntoPersonas;
	}

	public void setConjuntoPersonas(Persona[] conjuntoPersonas) {
		this.conjuntoPersonas = conjuntoPersonas;
	}



	protected class MiIteratorPersona implements Iterator<Persona>{
		protected int posicionArray;
		public MiIteratorPersona(){
			posicionArray = 0;
		}
		
		public boolean hasNext(){
			boolean result;
			if(posicionArray < conjuntoPersonas.length) result = true;
			else result = false;
			return result;
		}
		
		public Persona next(){
			this.posicionArray++;
			return conjuntoPersonas[posicionArray - 1];
		}
		
		public void remove(){
			throw new UnsupportedOperationException("No soportado.");
		}

		public int getPosicionArray() {
			return posicionArray;
		}

		public void setPosicionArray(int posicionArray) {
			this.posicionArray = posicionArray;
		}
		
		
	}

}
