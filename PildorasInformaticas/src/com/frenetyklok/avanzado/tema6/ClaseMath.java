package com.frenetyklok.avanzado.tema6;

public class ClaseMath {
	
	public static void main(String[] args){
		
		int x = -2;
		//los valores que se pasan a las funciones trigonométricas están en radianes
		System.out.println(Math.abs(x));
		System.out.println(Math.atan(x));
		System.out.println(Math.sin(Math.PI/2));
		System.out.println(Math.cos(0));
		System.out.println(Math.tan(Math.PI/2));
		System.out.println();
		
		double aRadianes = Math.toRadians(90);
		System.out.println(aRadianes);
		
		double aGrados = Math.toDegrees(Math.PI/2);
		System.out.println(aGrados);
		
	}

}
