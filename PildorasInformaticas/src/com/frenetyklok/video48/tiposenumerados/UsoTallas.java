package com.frenetyklok.video48.tiposenumerados;

public class UsoTallas {
	
	//DECLARAMOS EL TIPO ENUMERADO
	//COMO SI CREASEMOS UNA CLASE
	
	enum Talla{
		MINI, MEDIANO, GRANDE, MUY_GRANDE
	};
	
	
	//UNA VEZ DECLARADO EL TIPO ENUMERADO
	public static void main(String[] args) {
		
		//trabajaremos con el como si fuera un objeto
		//la clase a la que pertenece tiene métodos también
		//podemos acceder a los valores que hemos definido
		Talla s = Talla.MEDIANO;
		
		System.out.println(s.toString());//nos devuelve el valor que hemos guardado. NO HACE FALTA TOSTRING, COMO SIEMPRE
		System.out.println(s.name());
		System.out.println(s.ordinal());
		System.out.println(Talla.values().toString());//se puede sobreescribir toString??
		
		Talla m = Talla.MEDIANO;
		Talla l = Talla.GRANDE;
		Talla xl = Talla.MUY_GRANDE;
		
		//Talla h = Talla.ENORME;  ESTO DA ERROR PORQUE EL VALOR NO ESTÁ CONTEMPLADO EN LA DECLARACION
		
		
		
	}

}
