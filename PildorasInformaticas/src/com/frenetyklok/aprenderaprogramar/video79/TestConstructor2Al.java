package com.frenetyklok.aprenderaprogramar.video79;

import java.util.LinkedList;
import java.util.ArrayList;

public class TestConstructor2Al {
	
	public static void main(String[] args){
		
		LinkedList<String> miListaStrings = new LinkedList<String>();
		miListaStrings.add("Liebre");
		miListaStrings.add("Perro");
		
		ArrayList<String> miArrayListStrings = new ArrayList<>(miListaStrings);
		
		System.out.println("Contenido del LinkedList: " + miListaStrings);
		System.out.println("Contenido del ArrayList: " + miArrayListStrings);
		
	}

}
