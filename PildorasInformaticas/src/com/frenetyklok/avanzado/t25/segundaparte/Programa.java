package com.frenetyklok.avanzado.t25.segundaparte;

public class Programa {
	
	public static void main(String[] args){
		Persona p = new Persona(1, "Mar�a", 167);
		p.getAgenda().put("Trabajo", "987987987");
		p.getAgenda().put("Oficina", "965965965");
		p.getAgenda().put("M�vil", "678678678");
		p.getAgenda().put("Casa", "923923923");
		System.out.println("Persona: " + p);
		
		/*
		 * COMO SE PUEDE OBSERVAR SE IMPRIME ORDENADO POR CLAVE
		 * COMO LA CLAVE ES STRING SE UTILIZA SU ORDEN NATURAL POR DEFECTO
		 * ESTE ES EN ORDEN ALFAB�TICO
		 */
		
		System.out.println(p.getAgenda().get("M�vil"));//para recuperar un valor mediante su clave
	}

}
