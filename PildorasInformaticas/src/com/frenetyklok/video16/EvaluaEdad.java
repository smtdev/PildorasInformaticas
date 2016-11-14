package com.frenetyklok.video16;

import java.util.*;

public class EvaluaEdad {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad por favor: ");
		
		int edad = entrada.nextInt();
		
		if(edad > 18){
			System.out.println("Eres mayor de edad!");
		}
		else if(edad == 18){
			System.out.println("Acabas de hacerte mayor de edad!");
		}
		else{
			System.out.println("No eres mayor de edad. Tienes que esperar para votar!");
		}

	}

}
