package com.frenetyklok.util;

import java.util.Random;

public class MetodosUtil {
	
	//genera un número entero aleatorio entre otros dos
	public int generaEnteroAleatorio(int max, int min){
		int aleatorio = (int) (Math.floor(Math.random() * (max - min + 1) + min));
		return aleatorio;
	}
	
	public int generaEnteroAleatorioRandom(int max, int min){
		Random r = new Random();
		int aleatorio = r.nextInt(max - min + 1) + min;
		return aleatorio;
	}

}
