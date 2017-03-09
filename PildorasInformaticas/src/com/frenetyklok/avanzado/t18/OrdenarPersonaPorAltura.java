package com.frenetyklok.avanzado.t18;

import java.util.Comparator;

/*
 * ESTA CLASE PERMITE LA ORDENACION TOTAL (O SEA, DISTINTA DEL ORDEN NATURAL)
 * DE LA CLASE PERSONA
 */

public class OrdenarPersonaPorAltura implements Comparator<Persona> {

	@Override
	public int compare(Persona arg0, Persona arg1) {
		return arg1.getAltura() - arg0.getAltura(); //ordena segun este resultado sea negativo, en este caso de mayor a menor
	}
	
	

}
