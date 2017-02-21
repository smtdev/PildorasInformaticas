package com.frenetyklok.avanzado.tema8;

import java.util.Random;
import java.math.*;

public class PruebasRandom {
	
	public static void main(String[] args){
		
		Random rdm = new Random();
		int aleatorio = rdm.nextInt();
		System.out.println(aleatorio);
		
	
		System.out.println(BigDecimal.valueOf(rdm.nextDouble()).setScale(2, RoundingMode.HALF_UP));
		
	}

}
