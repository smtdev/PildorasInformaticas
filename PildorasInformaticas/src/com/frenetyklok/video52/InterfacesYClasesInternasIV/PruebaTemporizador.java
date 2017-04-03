package com.frenetyklok.video52.InterfacesYClasesInternasIV;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {
	
	public static void main(String[] args){
		
		DameLaHora oyente = new DameLaHora();
		
		Timer miTemporizador = new Timer(2000, oyente);
		
		miTemporizador.start();//SI NO PONEMOS NADA MAS EL PROGRAMA SE ACABA AL LLEGAR A ESTA LINEA
		
		//TENEMOS QUE CONSEGUIR QUE EL PROGRAMA NO DEJE DE EJECUTARSE
		//ESTO LO PODEMOS HACER POR EJEMPLO USANDO UN JOPTIONPANE, QUE NO SE PARA HASTA QUE SE LO DECIMOS
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		System.exit(0);
		
	}

}
