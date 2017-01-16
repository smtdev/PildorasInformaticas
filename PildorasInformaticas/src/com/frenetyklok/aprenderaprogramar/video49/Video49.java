package com.frenetyklok.aprenderaprogramar.video49;

public class Video49 {
	
	public Video49(){};
	
	public String concatena(String linea1, String linea2, String linea3){
		String parte1 = linea1.substring(0, 2);
		String parte2 = linea2.substring(0, 4);
		String parte3 = linea3.substring(0, 6);
		return parte1 + " " + parte2 + "-" + parte3;
	}
	
	
	//mejor este método porque requiere menos memoria y es más eficiente?
	public String concatena2(String linea1, String linea2, String linea3){
		
		return linea1.substring(0, 2) + " " + linea2.substring(0, 4) + "-" + linea3.substring(0, 6);
		
	}

}
