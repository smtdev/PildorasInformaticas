package com.frenetyklok.avanzado.t27;

import java.util.Date;

public class Programa {
	
	public static void main(String[] args){
		Date fecha1, fecha2;
		fecha1 = new Date(82, 4, 1, 10, 30, 15);
		fecha2 = new Date(112, 7, 7, 18, 25, 12);
		System.out.println("Fecha 1 local: " + fecha1.toLocaleString());
		System.out.println("Fecha 2 local: " + fecha2.toLocaleString());
		System.out.println("Fecha 1 en GMT: " + fecha1.toGMTString());
		System.out.println("Fecha 2 en GMT: " + fecha2.toGMTString());
		System.out.println("Fecha 1: " + fecha1.toString());
		System.out.println("Fecha 2: " + fecha2.toString());
		System.out.println("Es la fecha 1 posterior a la fecha 2? " + fecha1.after(fecha2));
	}

}
