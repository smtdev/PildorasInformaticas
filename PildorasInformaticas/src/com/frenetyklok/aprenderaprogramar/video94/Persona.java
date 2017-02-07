package com.frenetyklok.aprenderaprogramar.video94;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona(){
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
	}
	
	public Persona(String nombre, String apellidos, int edad){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public void setNombre(String nombre){ this.nombre = nombre;}
	public void setApellidos(String apellidos){ this.apellidos = apellidos;}
	public void setEdad(int edad){ this.edad = edad;}
	
	public String getNombre(){ return this.nombre;}
	public String getApellidos(){ return this.apellidos;}
	public int getEdad(){ return this.edad;}
	
	/*
	 * SOBREESCRITURA DEL METODO EQUALS
	 */
	
	@Override
	public boolean equals(Object objeto){
		if(objeto instanceof Persona){
			Persona tmpPersona = (Persona) objeto;
			
			if(this.nombre.equals(tmpPersona.nombre) && this.apellidos.equals(tmpPersona.apellidos) &&
					this.edad == tmpPersona.edad){
				return true;
			}else {
				return false;
			}
		}else{
			return false;
		}
	}

}
