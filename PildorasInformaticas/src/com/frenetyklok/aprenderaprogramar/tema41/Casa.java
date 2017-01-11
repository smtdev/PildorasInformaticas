package com.frenetyklok.aprenderaprogramar.tema41;

public class Casa {
	
	private double superficie;
	private String direccion;
	private SalonCasa salonCasa;
	private CocinaCasa cocina;
	
	public Casa(){
		this.superficie = 0.0;
		this.direccion = "desconocida";
		this.salonCasa = new SalonCasa();
		this.cocina = new CocinaCasa();
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
