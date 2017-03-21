package com.frenetyklok.avanzado.t28;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Programa {
	
	public static void main(String[] args){
		
		Calendar c1 = GregorianCalendar.getInstance();
		
		//c1.setLenient(false);
		
		System.out.println("Fecha actual: " + c1.getTime().toLocaleString());
		c1.set(2000, Calendar.AUGUST, 31);
		System.out.println("Fecha 31 agosto del 2000: " + c1.getTime().toLocaleString());
		c1.set(Calendar.MONTH, 13);
		System.out.println("Fecha 13 meses más: " + c1.getTime().toLocaleString());
		//como hemos visto no nos da el valor deseado ni aunque pongamos un número entre 0 y 11
		//NO SE POR QUÉ PASA ESTO, PUES PORQUE NO TODOS LOS MESES TIENEN 31 DÍAS Y POR ESO DA EL RESULTADO MAS APROX.
		c1.set(2000, 7, 31);
		System.out.println("Fecha puesta: " + c1.getTime().toLocaleString());
		//hemos puesto otra vez la fecha de 31 de agosto
		c1.add(Calendar.MONTH, 13);
		System.out.println("Fecha 13 meses más con add: " + c1.getTime().toLocaleString());
		c1.roll(Calendar.HOUR, 25);//añadimos 25 horas sin cambiar otros valores pero no tenemos de las 0 a las 12
		System.out.println("Fecha añadimos 25 horas: " + c1.getTime().toLocaleString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss");
		System.out.println("Fecha formateada: " + sdf.format(c1.getTime()));
	}

}
