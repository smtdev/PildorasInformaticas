package com.frenetyklok.aprenderaprogramar.video69;
import java.util.Scanner;

public class TestArray {
	
	public static void main(String[] args){
		
		String[] mesesYear = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		String mesSecreto = mesesYear[9];
		
		System.out.println(mesSecreto);
		
		String contestacion = "";
		Scanner escaner = new Scanner(System.in);
		do{
			System.out.println("Adivine el mes del año que pienso!");
			contestacion = escaner.nextLine();
		}while(! mesSecreto.equals(contestacion)); //ATENCIÓN, NO SE PUEDEN COMPARAR STRINGS CON == HAY QUE USAR EQUALS

		escaner.close();
		
		System.out.println("Enhorabuena, has acertado!");
		
	}

}
