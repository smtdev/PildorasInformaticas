package com.frenetyklok.aprenderaprogramar.video81;

import com.frenetyklok.aprenderaprogramar.video81.Vehiculo.MarcaDeVehiculo;

public class TestVehiculo {
	
	public static void main(String[] args){
		
		Vehiculo coche = new Vehiculo("3333B", MarcaDeVehiculo.FORD);
		
		System.out.println(coche);
		
		//ahora vamos a cambiar la matricula y la marca al mismo coche
		System.out.println("");
		
		coche.setMarca(MarcaDeVehiculo.RENAULT);
		coche.setMatricula("4444C");
		
		System.out.println(coche);
		
		//comprobemos la recuperación de valores con los getters
		System.out.println(coche.getMatricula() + " " + coche.getMarca());
		
		System.out.println(MarcaDeVehiculo.FORD);//si añadimos toString sale lo mismo pero no es un objeto cualquiera sino un String
	}

}
