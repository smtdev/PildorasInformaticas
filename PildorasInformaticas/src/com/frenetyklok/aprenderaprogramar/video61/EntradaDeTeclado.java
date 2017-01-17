package com.frenetyklok.aprenderaprogramar.video61;
import java.util.Scanner;

public class EntradaDeTeclado {
	
	private String entradaTeclado;
	
	public EntradaDeTeclado(){
		
		this.entradaTeclado = "";
		
		pedirEntrada();
	}
	
	public void pedirEntrada(){
		Scanner entradaEscaner = new Scanner(System.in);
		this.entradaTeclado = entradaEscaner.nextLine();
	}
	
	public String getEntrada(){return this.entradaTeclado;}
	
	public String getPrimeraPalabra(){
		for(int i = 0; i < entradaTeclado.length(); i++){
			if(entradaTeclado.substring(i, i + 1).equals(" ")){
				return entradaTeclado.substring(0, i + 1);
			}
			
		}
		return entradaTeclado;
	}
	
	public int getLongitud(){return entradaTeclado.length();}
	
	

}
