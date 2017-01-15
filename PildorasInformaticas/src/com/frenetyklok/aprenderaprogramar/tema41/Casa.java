package com.frenetyklok.aprenderaprogramar.tema41;

public class Casa {
	
	private double superficie;
	private String direccion;
	private SalonCasa salonCasa;
	private CocinaCasa cocina;
	
	
	//este es el primer constructor
	public Casa(){
		this.superficie = 0.0;
		this.direccion = "desconocida";
		this.salonCasa = new SalonCasa();
		this.cocina = new CocinaCasa();
	}
	
	//creamos ahora un segundo constructor al que le pasamos parámetros
	public Casa(double superficie, String direccion, SalonCasa salonCasa, CocinaCasa cocina){
		this.superficie = superficie;
		this.direccion = direccion;
		//no se puede hacer así antes de crear constructores como estos en la clase correpondiente
		this.salonCasa = new SalonCasa(salonCasa.getNumeroTelevisores(), salonCasa.getTipoSalon());
		this.cocina = new CocinaCasa(cocina.getEsIndependiente(), cocina.getNumeroDeFuegos());
	}
	
	public double getSuperficie(){
		return superficie;
	}
	
	public String getDireccion(){
		return direccion;
	}
	
	public String getSalonCasa(){
		return "mi salón tiene " + this.salonCasa.getNumeroTelevisores() + " televisores y es de tipo " +
				this.salonCasa.getTipoSalon();
	}
	
	public String getCocinaCasa(){
		String respuesta;
		if(this.cocina.getEsIndependiente()){
			respuesta = " mi cocina es independiente y tiene ";
		}else {
			respuesta = " mi cocina no es independiente y tiene ";
		}
		
		respuesta += this.cocina.getNumeroDeFuegos() + " fogones";
		
		return respuesta;
	}
	
	public static void main(String[] args){
		
		Casa miCasa = new Casa();
		
		String respuestaFinal = "Mi casa tiene " + miCasa.getSuperficie() + " metros cuadrados" +
								 " y está en la dirección " + miCasa.getDireccion() +
								 " y " + miCasa.getSalonCasa() + miCasa.getCocinaCasa();
		
		System.out.println(respuestaFinal);
	} 
								
		
		
		
		
	

}
