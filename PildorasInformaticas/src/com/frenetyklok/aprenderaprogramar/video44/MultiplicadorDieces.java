package com.frenetyklok.aprenderaprogramar.video44;

public class MultiplicadorDieces {
	
	
	//estamos haciendo un casting interno. ver como va esto
	public double multiplicarPorDieces(double primerNumero, int segundoNumero){
		return Math.pow(10, segundoNumero) * primerNumero;
	}
	
	
	public static void main(String[] args){
		MultiplicadorDieces obj = new MultiplicadorDieces();
		double resultado = obj.multiplicarPorDieces(2, 3);
		System.out.println(resultado);
	}

}
