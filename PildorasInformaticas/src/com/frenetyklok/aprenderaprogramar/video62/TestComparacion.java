package com.frenetyklok.aprenderaprogramar.video62;

public class TestComparacion {
	
	public static void main(String[] args){
		
		
		String ave = "ave";
		String avispa = "avispa";
		
		//se puede mejorar el código sin usar estas variables y accediendo al valor mediante el metodo lenth() en todos los casos?
		int valorAve = ave.length();
		int valorAvispa = avispa.length();
		
		if(valorAve >= valorAvispa){
			for(int i = 0; i < valorAvispa; i++){
				if(ave.charAt(i) == avispa.charAt(i)){
					System.out.println("La letra " + (i + 1) + " es igual en las dos palabras y su valor es: " + ave.charAt(i));
				}else{
					System.out.println("La letra " + (i + 1) + " no es igual en las dos palabras.");
				}
			}
			for(int i = valorAvispa; i < valorAve; i++){
				System.out.println("La palabra " + avispa + " no tiene letra en la posición " + (i + 1));
			}
		}
		
		if(valorAve < valorAvispa){
			for(int i = 0; i < valorAve; i++){
				if(ave.charAt(i) == avispa.charAt(i)){
					System.out.println("La letra " + (i + 1) + " es igual en las dos palabras y su valor es: " + ave.charAt(i));
				}else{
					System.out.println("La letra " + (i + 1) + " no es igual en las dos palabras.");
				}
			}
			for(int i = valorAve; i < valorAvispa; i++){
				System.out.println("La palabra " + ave + " no tiene letra en la posición " + (i + 1));
			}
		}
	}

}
