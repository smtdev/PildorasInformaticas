package com.frenetyklok.avanzado.t25;

import java.util.HashMap;
import java.util.Map;

public class Programa {
	
	public static void main(String[] args){
		Map<Integer, Persona> mp = new HashMap<Integer, Persona>();
		Persona p = new Persona(4,"María", 167);
		mp.put(4, p);
		p = new Persona(1,"Marta", 165);
		mp.put(1, p);
		p = new Persona(3,"Elena", 185);
		mp.put(3, p);
		p = new Persona(2,"Yolanda", 174);
		mp.put(2, p);
		p = new Persona(5,"María Dolores", 169);
		mp.put(4, p);//ESTO CREA UNA COLISION YA QUE NO PUEDE HABER DOS OBJETOS CON LA MISMA CLAVE  Y PISA EL PRIMER VALOR
						
		
		System.out.println("Personas en el mapa: \n" + mp.toString().replaceAll("," , "\n"));
		
		
	}

}
