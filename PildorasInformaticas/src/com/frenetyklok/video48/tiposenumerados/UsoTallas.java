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
		Talla s = Talla.MINI;
		
		System.out.println(s.toString());//nos devuelve el valor que hemos guardado. NO HACE FALTA TOSTRING, COMO SIEMPRE
		
	}

}
