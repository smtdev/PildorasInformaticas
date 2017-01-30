package com.frenetyklok.aprenderaprogramar.video75;

public class TestUsoIncorrectoEquals {
	
	public static void main(String[] args){
		
		int[] miArray1 = {2, -4, 3, -7};
		for(int i = 0; i < miArray1.length; i++){
			System.out.println("miArray1[" + i + "]=" + miArray1[i] + ";");
		}
		
		System.out.println("");
		
		int[] otroArray = {1, 2, 4, 8};
		for(int i = 0; i < otroArray.length; i++){
			System.out.println("otroArray[" + i + "]=" + otroArray[i]+ ";");
		}
		
		System.out.println("");
		
		System.out.println("Son el mismo objeto?..." + (miArray1 == otroArray));
		
		System.out.println("Tienen el mismo contenido (relaci�n de igualdad)?..." + (miArray1.equals(otroArray)));
		
		/*
		 * aunque otroArray fuese definido con los mismos valores que miArray1 tampoco dar�a true con equals
		 * ya que no est� definido este m�todo para los arrays. Si que lo estaba para los Strings
		 * Para comparar arrays deberemos usar la clase Arrays, que sirve precisamente para manipular arrays
		 */
		
		System.out.println("");
		
		otroArray = miArray1; // otroArray pasa a apuntar al mismo objeto que miArray1
		
		for(int i = 0; i < otroArray.length; i++){
			System.out.println("otroArray[" + i + "]=" + otroArray[i]+ ";");
		}
		
		System.out.println("");
		
		System.out.println("Son el mismo objeto?..." + (miArray1 == otroArray));
		
		System.out.println("Tienen el mismo contenido (relaci�n de igualdad)?..." + (miArray1.equals(otroArray)));
		
	}

}
