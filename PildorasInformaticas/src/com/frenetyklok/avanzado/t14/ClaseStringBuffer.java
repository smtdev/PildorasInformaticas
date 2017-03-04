package com.frenetyklok.avanzado.t14;

/*
 * LA CLASE STRINGBUILDER TIENE LOS MISMOS METODOS
 * LA DIFERENCIA ES QUE STRINGBUFFER TIENE LOS METODOS
 * SINCRONIZADOS LO QUE PERMITE TRABAJAR CON MULTIPLES HILOS
 * DE EJECUCION. LA CLASE STRINBUILDER ES MAS EFECTIVA SI
 * NO TENEMOS QUE TRABAJAR CON HILOS DE EJECUCION
 */

public class ClaseStringBuffer {
	
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		sb.append("Hola me llamo Pablo");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.deleteCharAt(1);
		System.out.println(sb);
		System.out.println(sb.length());
		sb.insert(1, 'o');
		System.out.println(sb);
		sb.delete(1, 2);
		System.out.println(sb);
		sb.insert(1, 'o');
		System.out.println(sb);
		System.out.println(sb.substring(0, 4));
		System.out.println(sb);
	}

}
