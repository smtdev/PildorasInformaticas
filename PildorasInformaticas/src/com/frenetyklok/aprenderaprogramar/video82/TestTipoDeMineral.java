package com.frenetyklok.aprenderaprogramar.video82;

public class TestTipoDeMineral {
	
	public static void main(String[] args){
		
		System.out.println("Los pesos de un palet según el tipo de mineral y teniendo en cuenta que"
				+ " un palet ocupa un volumen de 2.27 m3 son: ");
		
		for(TipoDeMineral tmp : TipoDeMineral.values()){
			System.out.println(tmp.toString() + ": " + (tmp.getPesoEspecifico() * 2.27f) + "Kg");
		}
		
	}

}
