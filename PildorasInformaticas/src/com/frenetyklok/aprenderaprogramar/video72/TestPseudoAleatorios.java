package com.frenetyklok.aprenderaprogramar.video72;

import com.frenetyklok.aprenderaprogramar.video61.*;

public class TestPseudoAleatorios {
	
	public static void main(String[] args){
		
		System.out.println("Arranca el programa!");
		Integer tmpInteger = 0;
		EntradaDeTeclado entradaMain = new EntradaDeTeclado();
		
		char tecla = 'S';
		
		while(tecla == 'S'){
			System.out.println("Por favor, introduzca el número de elementos en la serie de números aleatorios:");
			entradaMain.pedirEntrada();
			
			tmpInteger = tmpInteger.valueOf(entradaMain.getEntrada());//ESTO NO ESTA FUNCIONANDO BIEN. POR QUE?
			
			SerieDeAleatorios serieDePrueba = new SerieDeAleatorios((int) tmpInteger);
			serieDePrueba.generarSerieDeAleatorios();
			serieDePrueba.mostrarSerie();
			tecla = ' ';
			System.out.println("Generar otra serie? (S/N)");
			
			while(tecla != 'n' && tecla != 'N' && tecla != 's' && tecla != 'S'){
				entradaMain.pedirEntrada();
			
			
				//OJO TENEMOS QUE COMPARAR CON EQUALS PORQUE LOS STRINGS SON OBJETOS
			
				if(entradaMain.getEntrada().equals("n") || entradaMain.getEntrada().equals("N")){
					tecla = 'N';
				}else if(entradaMain.getEntrada().equals("s") || entradaMain.getEntrada().equals("S")){
					tecla = 'S';
					
				}
			}
		}
		System.out.println("Gracias por utilizar el programa!");
	}
	
}
