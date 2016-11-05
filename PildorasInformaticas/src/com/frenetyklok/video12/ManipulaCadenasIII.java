package com.frenetyklok.video12;

public class ManipulaCadenasIII {

	public static void main(String[] args) {
		
		String alumno1, alumno2;
		alumno1 = "David";
		alumno2 = "David";
		
		System.out.println(alumno1.equals(alumno2));
		
		String alumno3 = "Pedro";
		System.out.println(alumno1.equals(alumno3));
		
		alumno2 = "david";
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));

	}

}


