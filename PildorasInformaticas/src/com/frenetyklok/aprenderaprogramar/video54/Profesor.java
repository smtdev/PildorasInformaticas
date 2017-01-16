package com.frenetyklok.aprenderaprogramar.video54;

public class Profesor {
	
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean casado;
	private boolean especialista;
	
	public Profesor(){
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		this.casado = false;
		this.especialista = false;
	}
	
	public Profesor(String nombre, String apellidos, int edad, boolean casado, boolean especialista){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.casado = casado;
		this.especialista = especialista;
	}
	
	public String getNombre(){return this.nombre;}
	public String getApellidos(){return this.apellidos;}
	public int getEdad(){return this.edad;}
	public boolean getCasado(){return this.casado;}
	public boolean getEspecialista(){return this.especialista;}
	
	public void setNombre(String nombre){this.nombre = nombre;}
	public void setApellidos(String apellidos){this.apellidos = apellidos;}
	public void setEdad(int edad){this.edad = edad;}
	public void setCasado(boolean casado){this.casado = casado;}
	public void setEspecialista(boolean especialista){this.especialista = especialista;}
	
	public static void main(String[] args){
		Profesor pablo = new Profesor("Pablo", "Díaz", 41, false, true);
		System.out.println("El profesor " + pablo.getNombre() + " " + pablo.getApellidos() +
				" tiene " + pablo.getEdad() + " años.");
		
		if(pablo.casado == true){
			System.out.println("Está casado.");
		}else{
			System.out.println("No está casado.");
		}
		
		if(pablo.especialista == true){
			System.out.println("Es especialista.");
		}else{
			System.out.println("No es especialista.");
		}
		
		pablo.setCasado(true);
		System.out.println("Está ahora casado? " + pablo.casado);
	}
}
