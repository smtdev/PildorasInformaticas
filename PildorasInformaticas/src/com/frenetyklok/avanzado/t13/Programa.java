package com.frenetyklok.avanzado.t13;

public class Programa {
	
	public static void main(String[] args){
		Persona p1 = new Persona(122123, 35);
		Persona p2 = new Persona(432432, 40);
		if(p1.compareTo(p2) < 0) System.out.println("La persona p1 es menor");
		else if(p1.compareTo(p2) > 0) System.out.println("La persona p1 es mayor");
		else System.out.println("Las dos personas son iguales");
	}

}
