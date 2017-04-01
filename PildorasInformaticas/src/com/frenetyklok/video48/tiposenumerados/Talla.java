package com.frenetyklok.video48.tiposenumerados;

public enum Talla {
	
	MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
	
	private String abreviatura;
	
	
	//no admiten la creacion de objetos los tipos enumerados
	//por ello el constructor es privado así no se puede invocar desde otras clases
	private Talla(String abreviatura){
		this.abreviatura = abreviatura;
	}
	
	//CREAMOS METODOS GETTER Y SETTER


	public String getAbreviatura() {
		return abreviatura;
	}


	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

}
