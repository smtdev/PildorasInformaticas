package com.frenetyklok.aprenderaprogramar.video52;

public class GrupoDepositos {
	
	private Deposito deposito1;
	private Deposito deposito2;
	private Deposito deposito3;
	private String idGrupo;
	private int numeroDepositosGrupo;
	
	public GrupoDepositos(int numeroDepositosGrupo, String idGrupo, Deposito deposito1, Deposito deposito2, Deposito deposito3){
		
		this.idGrupo = idGrupo;
		
		switch (numeroDepositosGrupo) {
		case 1:
			System.out.println("Un grupo ha de tener más de un depósito!");
			break;
			
		case 2:
			this.deposito1 = deposito1;
			this.deposito2 = deposito2;
			this.numeroDepositosGrupo = numeroDepositosGrupo;
			break;
			
		case 3:
			this.deposito1 = deposito1;
			this.deposito2 = deposito2;
			this.deposito3 = deposito3;
			this.numeroDepositosGrupo = numeroDepositosGrupo;
			break;

		default:
			System.out.println("No se admite este número de depósitos!");
			break;
		}
		
	}
	
	public int getNumeroDepositosGrupo(){
		return this.numeroDepositosGrupo;
	}
	
	public String getIdGrupo(){return this.idGrupo;}
	
	public float capacidadGrupo(){
		if(this.numeroDepositosGrupo == 2){
			return this.deposito1.valorCapacidad() + this.deposito2.valorCapacidad();
		}else{
			return this.deposito1.valorCapacidad() + this.deposito2.valorCapacidad() + this.deposito3.valorCapacidad();
		}
	}
	

}
