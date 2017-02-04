package com.frenetyklok.aprenderaprogramar.video82;

public class TestTipoDeMadera {
	
	public static void main(String[] args){
		
		TipoDeMadera maderaUsuario1 = TipoDeMadera.ROBLE;
		System.out.println("La madera elegida por el usuario1 es " + maderaUsuario1.toString() + "\ncon"
				+ " un color " + maderaUsuario1.getColor() + " y con un peso específico de " 
				+ maderaUsuario1.getPesoEspecifico());
		
		System.out.println();
		
		System.out.println("Un palet admite 2.27 m3 de volumen. A continuación el peso de los"
				+ " palets de las distintas maderas: ");
		
		System.out.println();
		
		for(TipoDeMadera tmp: TipoDeMadera.values()){
			System.out.println(tmp.toString() + ": el palet pesa: "
					+ (2.27f*(float)tmp.getPesoEspecifico()) + " Kg.");
		}
		
	}

}
