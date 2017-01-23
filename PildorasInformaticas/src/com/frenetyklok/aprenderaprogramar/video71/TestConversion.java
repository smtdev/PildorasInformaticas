package com.frenetyklok.aprenderaprogramar.video71;
import java.util.ArrayList;

public class TestConversion {
	
	public static void main(String[] args){
		ArrayList<Integer> miListadoAL;
		miListadoAL = new ArrayList<Integer>();
		
		ArrayList<Integer> tmpAL = new ArrayList<Integer>();
		
		miListadoAL.add(44);
		miListadoAL.add(7);
		miListadoAL.add(76);
		miListadoAL.add(29);
		miListadoAL.add(17);
		
		//RECORREMOS EL ARRAYLIST CON UN BUCLE FOR NORMAL QUEDANDONOS CON LOS ELEMENTOS QUE VAN A SER OPERADOS LUEGO
		
		for(int i = 0; i < miListadoAL.size(); i++){
			if(miListadoAL.get(i) < 10){
				System.out.println("Detectado un objeto (" + i + "): ");
			}
		}
	}

}
