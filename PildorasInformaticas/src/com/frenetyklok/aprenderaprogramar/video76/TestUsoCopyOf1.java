package com.frenetyklok.aprenderaprogramar.video76;
import java.util.Arrays;

public class TestUsoCopyOf1 {
	
	public static void main(String[] args){
		
		int[] miArray1 = {2, -4, 3, -7};
		for(int i = 0; i < miArray1.length; i++){
			System.out.println("miArray1[" + i + "]= " + miArray1[i] + ";");
		}
		
		System.out.println("");
		
		int[] otroArray = {1, 2, 4, 8};
		for(int i = 0; i < otroArray.length; i++){
			System.out.println("otroArray[" + i + "]= " + otroArray[i] + ";");
		}
		
		System.out.println("");
		
		System.out.println("Son el mismo objeto?..." + (miArray1 == otroArray));
		System.out.println("Tienen el mismo contenido?..." + (Arrays.equals(miArray1, otroArray)));
		
		System.out.println("");
		
		//COPIAMOS EL ARRAY UTILIZANDO EL METODO COPYOF
		
		//otroArray = Arrays.copyOf(miArray1, miArray1.length);
		
		//PODEMOS PROBAR CON OTRAS LONGITUDES
		//otroArray = Arrays.copyOf(miArray1, miArray1.length + 2);
		otroArray = Arrays.copyOf(miArray1, miArray1.length - 2);
		
		
		for(int i = 0; i < otroArray.length; i++){
			System.out.println("otroArray[" + i + "]= " + otroArray[i] + ";");
		}
		
		System.out.println("");
		
		System.out.println("Son el mismo objeto?..." + (miArray1 == otroArray));
		System.out.println("Tienen el mismo contenido?..." + (Arrays.equals(miArray1, otroArray)));
		
	}

}
