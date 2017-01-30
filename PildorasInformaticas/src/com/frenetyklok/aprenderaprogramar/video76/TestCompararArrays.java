package com.frenetyklok.aprenderaprogramar.video76;
import java.util.Arrays;

public class TestCompararArrays {
	
	public static void main(String[] args){
		
		int[] miArray1 = {2, -4, 3, -7};
		
		for(int i = 0; i < miArray1.length; i++){
			System.out.println("miArray1[" + i + "]= " + miArray1[i] + ";");
		}
		
		System.out.println("");
		
		int[] otroArray = {2, -4, 3, -7};
		
		for(int i = 0; i < otroArray.length; i++){
			System.out.println("otroArray[" + i + "]= " + otroArray[i] + ";");
		}
		
		System.out.println("");
		
		System.out.println("Son el mismo objeto?..." + (miArray1 == otroArray));
		System.out.println("Tienen el mismo contenido (relación de igualdad)?..." + (Arrays.equals(miArray1, otroArray)));
		
		otroArray = miArray1; //OTROARRAY AHORA APUNTA AL MISMO OBJETO QUE MIARRAY
		
		for(int i = 0; i < otroArray.length; i++){
			System.out.println("otroArray[" + i + "]= " + otroArray[i] + ";");
		}
		
		System.out.println("");
		
		System.out.println("Son el mismo objeto?..." + (miArray1 == otroArray));
		System.out.println("Tienen el mismo contenido (relación de igualdad)?..." + (Arrays.equals(miArray1, otroArray)));
		
	}
	

}
