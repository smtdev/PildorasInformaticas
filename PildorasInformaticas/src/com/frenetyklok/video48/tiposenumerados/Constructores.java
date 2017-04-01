package com.frenetyklok.video48.tiposenumerados;

import java.util.Scanner;

public class Constructores {
	
	
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una talla:MINI, MEDIANO, GRANDE O MUY GRANDE...");
		
		String entradaDatos = entrada.next().toUpperCase();//para guardarlo en mays.
		
		Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("La talla elegida es: " + laTalla);
		System.out.println("La abreviatura es: " + laTalla.getAbreviatura());
		
	}
	
	

}
