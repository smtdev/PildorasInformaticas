package com.frenetyklok.avanzado.tema7;

import java.math.*;

public class PruebaBigInteger {
	
	public static void main(String[] args){
		System.out.println(factorial2(new BigInteger("200")));
	}
	
	public static double factorial(int n){
		if(n == 1) return 1;
		else return n * factorial(n-1);
	}
	
	//EL RESULTADO ES INFINITY PORQUE NOS SALIMOS DE RANGO
	//LA SOLUCION ES TRABAJAR CON BIGINTEGER
	
	
	//es correcto utilizar ZERO y no ONE ya que 0! es igual a 1
	public static BigInteger factorial2(BigInteger n){
		if(n.equals(BigInteger.ZERO)) return BigInteger.ONE;
		else return n.multiply(factorial2(n.subtract(BigInteger.ONE)));
	}

}
