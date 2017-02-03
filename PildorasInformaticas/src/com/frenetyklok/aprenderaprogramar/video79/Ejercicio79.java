package com.frenetyklok.aprenderaprogramar.video79;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio79 {
	
	public static void main(String[] args){
		
		Boolean[] miArrayBooleano = {true, true, false, false, true, false};
		
		List<Boolean> miLinkedListBooleana = new LinkedList<Boolean>();
		
		miLinkedListBooleana = Arrays.asList(miArrayBooleano);//ESTO NO LO TENGO MUY CLARO!!
		
		System.out.println(miLinkedListBooleana);
		
	}

}
