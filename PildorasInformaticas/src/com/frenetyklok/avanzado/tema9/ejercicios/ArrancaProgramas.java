package com.frenetyklok.avanzado.tema9.ejercicios;

import java.io.IOException;

public class ArrancaProgramas {
	
	public static void main(String[] args) throws IOException{
		//Runtime.getRuntime().exec("C:/Program Files (x86)/Mozilla Firefox/firefox.exe www.xataka.com");
		long memoria = Runtime.getRuntime().totalMemory();
		System.out.println(memoria);
		
	}

}
