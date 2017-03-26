package com.frenetyklok.video43.polimorfismoyenlazadodinamico;

public class UsoEmpleado {

	public static void main(String[] args) {

		Jefatura jefeRRHH  = new Jefatura("Juan", 55000, 2006, 9, 25);
		jefeRRHH.setIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		misEmpleados[0] = new Empleado("Ana", 30000, 2000, 07, 07);
		misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
		misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);//por qué no se puede poner 09?
		misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);
		misEmpleados[4] = jefeRRHH;
		misEmpleados[5] = new Jefatura("María", 95000, 1999, 11, 9);//a este ya no le podemos establecer incentivo. Estáticamente es un Empleado y no accede al método para hacerlo
		
		System.out.println(misEmpleados[4]);//estático es Empleado pero de forma dinámica guarda un Jefe y lo muestra como tal
		System.out.println(misEmpleados[4].getClass().toString());//se puede ver que dinámicamente es un Jefe
		System.out.println(jefeRRHH);//las dos variables (tanto Empleado como Jefatura) apuntan al mismo objeto que es un Jefe.
		
		System.out.println("**********");
		
		/*
		 * COMO PODEMOS VER PODEMOS RECORRER EL ARRAY IGUAL
		 * Y CUANDO LLAMAMOS A GETSUELDO DEVUELVE AL DE LA CLASE
		 * QUE CORRESPONDE DE FORMA DINAMICA. PARA EL JEFE ESCOGE
		 * GETSUELDO DE LA CLASE JEFATURA, QUE ESTA OVERRIDE
		 */
		
		for(Empleado e: misEmpleados){
			System.out.println(e.getSueldo());
		}

	}

}
