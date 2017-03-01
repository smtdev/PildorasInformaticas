package com.frenetyklok.avanzado.t13;

public class Persona implements Comparable<Persona>{
	
	public int dni, edad;
	
	public Persona(int dni, int edad){
		this.dni = dni;
		this.edad = edad;
	}

	@Override
	public int compareTo(Persona persona) {
		int resultado = 0;
		if(this.edad < persona.edad){
			resultado = -1;
		}else if(this.edad > persona.edad){
			resultado = 1;
		}else {
			if(this.dni < persona.dni) resultado = -1;
			if(this.dni > persona.dni) resultado = 1;
			else resultado = 0;
		}
		
		return resultado;
	}

}
