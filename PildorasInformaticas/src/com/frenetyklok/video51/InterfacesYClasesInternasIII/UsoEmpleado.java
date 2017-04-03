package com.frenetyklok.video51.InterfacesYClasesInternasIII;

import java.util.Arrays;

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
		
		/*
		 * PARA PODER ESTABLECER UN INCENTIVO A MISEMPLEADOS[5]
		 * HAREMOS UN CASTING YA QUE EN ESTE CASO PODEMOS HACERLO YA QUE 
		 * UN JEFE HEREDA DE UN EMPLEADO. NO PODRÍAMOS HACER CASTING DE 
		 * EMPLEADO A JEFE YA QUE NO ES POSIBLE PORQUE EMPLEADO NO
		 * HEREDA DE JEFE
		 */
		
		
		
		Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];
		jefaFinanzas.setIncentivo(10000);//al final, al usar misEmpleados[5] saldrá lo que queremos porque todas estas variables apuntan al mismo objeto
		
		
		//Jefatura jefeTodo = (Jefatura) misEmpleados[1]; no da error al compilar ya que esto no se puede hacer
		
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
		
		//PARTE ESPECIFICA DE ESTE VIDEO 50
		//HAY QUE IMPLEMENTAR LA INTERFAZ COMPARABLE A EMPLEADO PARA QUE FUNCIONE
		
		System.out.println(jefaFinanzas.tomarDecisiones("Subir sueldos a todos los trabajadores"));
		
		Empleado directorComercial = new Jefatura("Sandra", 49000, 2012, 05, 05);
		
		Comparable ejemplo = new Empleado("Elisa", 95000, 2011, 04, 03);
		
		if(directorComercial instanceof Empleado) System.out.println("Es de tipo Jefatura");
		if(ejemplo instanceof Comparable) System.out.println("Implementa la interfaz Comparable");
		
		Arrays.sort(misEmpleados);
		
		//AHORA YA ESCRIBE LOS RESULTADOS EN EL ORDEN DEL ARRAY QUE ES EL QUE QUEREMOS, ORDENADO POR SUELDO
		
		for(Empleado e: misEmpleados){
			System.out.println(e.getSueldo());
		}

	}
	
	//NO SE PUEDE HEREDAR DE UNA CLASE FINAL
	//NO SE PUEDE OVERRIDE UN METODO FINAL

}
