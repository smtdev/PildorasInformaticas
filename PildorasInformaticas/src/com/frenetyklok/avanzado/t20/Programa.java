package com.frenetyklok.avanzado.t20;

import java.util.ArrayList;
import java.util.Random;

public class Programa {
	
	public static void main(String[] args){
		Random rd = new Random();
		int valor;
		for(int i = 0; i < 1000; i++){
			valor = rd.nextInt(4) + 1;
			System.out.println(valor);
		}
	}

}
