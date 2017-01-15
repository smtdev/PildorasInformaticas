package com.frenetyklok.aprenderaprogramar.video47;

public class MiniCalculadoraEjemplo {
	
	public int absoluto(int valor){
		return Math.abs(valor);
	}
	
	public double raizCuadrada(double valor){
		return Math.sqrt(valor);
	}
	
	public static void main(String[] args){
		MiniCalculadoraEjemplo obj = new MiniCalculadoraEjemplo();
		int resultado1 = obj.absoluto(-3);
		double resultado2 = obj.raizCuadrada(3.4);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
	}

}
