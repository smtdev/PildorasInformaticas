package com.frenetyklok.aprenderaprogramar.video65;

public class TestListaNombres {

	public static void main(String[] args) {

		ListaNombres ln = new ListaNombres("listaPrueba");
		
		ln.addNombre("Pablo");
		ln.addNombre("Pedro");
		ln.addNombre("Juan");
		
		
		String nombre1 = ln.getNombre(0);
		System.out.println(nombre1);
		
		System.out.println(ln.getTamano());
		
		ln.removeNombre(2);
		System.out.println(ln.getNombre(2));
		

	}

}
