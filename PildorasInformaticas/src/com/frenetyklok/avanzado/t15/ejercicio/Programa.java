package com.frenetyklok.avanzado.t15.ejercicio;

import java.util.*;

public class Programa {
	
	public static void main(String[] args){
		AvesEnZoo ave1 = new AvesEnZoo("Águila", 14, 15);
		AvesEnZoo ave2 = new AvesEnZoo("Buitre", 24, 25);
		AvesEnZoo ave3 = new AvesEnZoo("Halcón", 34, 35);
		
		AvesEnZoo[] aves = {ave1, ave2, ave3};
		
		GruposAvesZoo avesGrupo = new GruposAvesZoo(aves);
		
		Iterator<AvesEnZoo> it = avesGrupo.iterator();
		
		while(it.hasNext()){
			AvesEnZoo tmp = it.next();
			System.out.println(tmp);
		}
	}

}
