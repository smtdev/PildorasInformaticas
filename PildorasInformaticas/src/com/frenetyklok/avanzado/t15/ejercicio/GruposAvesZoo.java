package com.frenetyklok.avanzado.t15.ejercicio;

import java.util.Iterator;

public class GruposAvesZoo implements Iterable<AvesEnZoo> {
	
	AvesEnZoo[] aves;
	
	public GruposAvesZoo(AvesEnZoo[] aves){
		this.aves = aves;
	}
	
	public Iterator<AvesEnZoo> iterator(){
		Iterator<AvesEnZoo> it = new MiIteratorAvesEnZoo();
		return it;
	}
	
	protected class MiIteratorAvesEnZoo implements Iterator<AvesEnZoo>{
		protected int posicionArray;
		
		public MiIteratorAvesEnZoo(){
			this.posicionArray = 0;
		}
		
		public boolean hasNext(){
			boolean resultado;
			if(this.posicionArray < aves.length) resultado = true;
			else resultado = false;
			return resultado;
			
		}
		
		public AvesEnZoo next(){
			this.posicionArray++;
			return aves[posicionArray - 1];
		}
		
		public void remove(){
			throw new UnsupportedOperationException("No soportado.");
		}
	}

}
