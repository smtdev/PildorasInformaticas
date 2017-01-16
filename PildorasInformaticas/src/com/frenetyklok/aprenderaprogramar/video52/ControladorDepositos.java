package com.frenetyklok.aprenderaprogramar.video52;

public class ControladorDepositos {

	public static void main(String[] args) {


		Deposito deposito1 = new Deposito(10.0f, 5.0f, "1");
		Deposito deposito2 = new Deposito(8.0f, 3.0f, "2");
		Deposito deposito3 = new Deposito(4.0f, 1.0f, "3");
		
		GrupoDepositos grupo1 = new GrupoDepositos(3, "GRUP", deposito1, deposito2, deposito3);
		
		float resultado = grupo1.capacidadGrupo();
		System.out.println(resultado);
		
		

	}

}
