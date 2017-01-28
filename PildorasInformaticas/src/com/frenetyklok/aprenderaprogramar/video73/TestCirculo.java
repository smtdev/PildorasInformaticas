package com.frenetyklok.aprenderaprogramar.video73;
import com.frenetyklok.aprenderaprogramar.video61.*;

public class TestCirculo {
	
	public static void main(String[] args){
		System.out.println("Empieza el programa.");
		System.out.println("Por favor introduce el valor de la circunferencia: ");
		
		EntradaDeTeclado entrada = new EntradaDeTeclado();
		
		double radio = Double.parseDouble(entrada.getEntrada());
		
		Circulo circulo = new Circulo(radio);
		
		double area = circulo.areaCirculo();
		double longitud = circulo.longitudCirculo();
		
		System.out.println("El círculo tiene de area " + area);
		System.out.println("La circunferencia tiene de longitud: "  + longitud);
	}

}
