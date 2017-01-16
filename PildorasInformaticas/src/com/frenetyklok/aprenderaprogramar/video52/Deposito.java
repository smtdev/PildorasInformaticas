package com.frenetyklok.aprenderaprogramar.video52;

public class Deposito {
	
	private float diametro;
	private float altura;
	private String idDeposito;
	
	
	public Deposito(){
		
		//solamente llama al constructor con parámetros y le pasa valores determinados
		this(0, 0, "");
		
	}
	
	public Deposito(float diametro, float altura, String idDeposito){
		
		if(diametro > 0 && altura > 0){
			this.diametro = diametro;
			this.altura = altura;
			this.idDeposito = idDeposito;
		}else{
			this.diametro = 10;
			this.altura = 5;
			this.idDeposito = "000";
			System.out.println("Creado depósito con valores por defecto");
		}
	}
	
	public void setDeposito(float diametro, float altura, String idDeposito){
		this.diametro = diametro;
		this.altura = altura;
		this.idDeposito = idDeposito;
		
		if(idDeposito != "" && diametro > 0 && altura > 0){
			
		}else {
			System.out.println("Valores no admisibles");
			this.diametro = 0;
			this.altura = 0;
			this.idDeposito = "";
		}
	}
	
	public float getDiametro(){return this.diametro;}
	public float getAltura(){return this.altura;}
	public String getIdDeposito(){return this.idDeposito;}
	
	public float valorCapacidad(){
		float capacidad;
		capacidad = (float)Math.PI * (this.diametro / 2) * (this.diametro / 2) * altura;
		return capacidad;
	}

}
