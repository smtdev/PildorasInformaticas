package com.frenetyklok.aprenderaprogramar.video71;

import java.util.ArrayList;

public class TestConversion2 {
	
	public static void main (String [] Args) {  
	    ArrayList<Integer> miListadoAL;
	    miListadoAL = new ArrayList<Integer>();
	    
	    ArrayList<Integer> tmpAL = new ArrayList<Integer>();
	    
	    miListadoAL.add(44); 
	    miListadoAL.add(7); 
	    miListadoAL.add(76); 
	    miListadoAL.add(29); 
	    miListadoAL.add(17);
	    
	    //Recorremos el ArrayList con un for normal quedándonos con los elementos que van a ser operados a posteriori
	       for (int i=1; i <= miListadoAL.size(); i++) {
	           if (miListadoAL.get(i-1) < 10) { System.out.println ("Detectado un objeto (" + i +"):"+miListadoAL.get(i-1)+ ", integer con valor menor de 10, será eliminado");
	               tmpAL.add(i-1);}
	           System.out.println ("Elemento en el array list (" + i + ") : " + miListadoAL.get(i-1) );
	       }
	       
	       
	       for (int i=0; i < tmpAL.size(); i++) {
	          System.out.println ("Eliminamos ítem "+ (tmpAL.get(i)+1) +": " + miListadoAL.get(tmpAL.get(i) ) );
	          int temp = tmpAL.get(i);//PUEDO GUARDAR UN INTEGER COMO INT DIRECTAMENTE PERO NO PUEDO PASAR COMO PARAMETRO UN INTEGER SIN HACER EL CAMBIO DE TIPO
	          miListadoAL.remove(temp);
	          
	          //LO SIGUIENTE, AUNQUE COMENTADO TAMBIEN FUNCIONA. LO QUE NO FUNCIONA ES QUITAR (INT)
	           //miListadoAL.remove((int)tmpAL.get(i) ); //el método remove requiere un int y el método get devuelve Integer
	       }
	       
	       System.out.println("Valor devuelto por size() en miListadoAL después de borrado: " + miListadoAL.size() );
	       
	       int tmpInt = 0;
	       for (Integer tmpObjeto: miListadoAL) {
	           System.out.println ("Elemento en el array list ("+(tmpInt+1)+") : " + tmpObjeto);
	           tmpInt++;
	       }
	} //Cierre del main


}//cierre de clase
