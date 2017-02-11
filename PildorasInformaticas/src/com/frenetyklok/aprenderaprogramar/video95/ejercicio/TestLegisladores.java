package com.frenetyklok.aprenderaprogramar.video95.ejercicio;

public class TestLegisladores {
	
	public static void main(String[] args){
		Diputado diputado1 = new Diputado("Pablo", "Díaz", 41, "Asturias", "Independiente");
		Diputado diputado2 = new Diputado("Pedro", "Sánchez", 45, "Madrid", "PSOE");
		Diputado diputado3 = new Diputado("Mariano", "Rajoy", 60, "Pontevedra", "PP");
		
		Senador senador1 = new Senador("Eustaquio", "Eustaquiez", 33, "Zaragoza", "Podemos");
		Senador senador2 = new Senador("Manganito", "Manganez", 36, "Huesca", "Ciudadanos");
		Senador senador3 = new Senador("Parentanito", "Parentanez", 39, "Teruel", "Otros");
		
		ListinLegisladores listaLegisladores = new ListinLegisladores();
		
		listaLegisladores.addLegislador(diputado1);
		listaLegisladores.addLegislador(diputado2);
		listaLegisladores.addLegislador(diputado3);
		listaLegisladores.addLegislador(senador1);
		listaLegisladores.addLegislador(senador2);
		listaLegisladores.addLegislador(senador3);
		
		listaLegisladores.mostrarLegisladores();
	}

}
