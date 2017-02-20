package com.frenetyklok.avanzado.tema7;

import java.math.*;

public class UsoValueOfEnBigDecimal {
	
	public static void main(String[] args){
		int resultado = 1;
		for(int i = 1; i <= 5; i++){
			resultado = resultado * 10;
		}
		System.out.println(2.55 * resultado);
		BigDecimal result1 = BigDecimal.valueOf(2.55).multiply(BigDecimal.valueOf(resultado));
		System.out.println(result1.setScale(4, RoundingMode.HALF_UP));
		
		
		System.out.println("Probemos usando valueOf...");
		
		int multiplicador = 1;
		for(int i = 1; i <= 5; i++){
			multiplicador = multiplicador * 10;
		}
		BigDecimal result = BigDecimal.valueOf(2.55).multiply(BigDecimal.valueOf(multiplicador));
		result = result.setScale(2, RoundingMode.HALF_UP);
		System.out.println(result);
	}

}
