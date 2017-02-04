package com.frenetyklok.aprenderaprogramar.video81;

/**
 * En esta clase lo que haremos es presentar el uso de los tipos enumerados
 * @author Frenetyklok
 *
 */

public class TestEnum {
	
	enum TipoDeMadera {ROBLE, CAOBA, NOGAL, CEREZO, BOJ};
	
	public static void main(String[] args){
		
		TipoDeMadera maderaUsuario;
		maderaUsuario = TipoDeMadera.ROBLE;
		
		System.out.println("La madera elgida por el usuario es: " + maderaUsuario.toString().toLowerCase());
		
		
		System.out.println("Es la madera elegida por el usuario caoba? Resultado: " + (maderaUsuario.equals(TipoDeMadera.CAOBA)));
		
		System.out.println("Es la madera elegida por el usuario roble? Resultado: " + (maderaUsuario == TipoDeMadera.ROBLE));
		
		//como debemos comparar estos objetos. Creo que debería ir con cuidado porque no sabemos cómo esta definido equals
		
	}

}
