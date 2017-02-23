package com.frenetyklok.avanzado.tema9;

import java.util.Random;

public class EjercicioResuelto {
	
	public static void main(String[] args){
		int a, b, c;
		Random rdm = new Random();
		//generamos números [65 -99]
		a = rdm.nextInt(26) + 65;
		b = rdm.nextInt(26) + 65;
		c = rdm.nextInt(26) + 65;
		System.out.println(a + " " + b + " " + c);
	}

}
