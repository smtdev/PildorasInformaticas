package com.frenetyklok.video55_56_57_58_59_60_61_62_63_64.swing;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.imageio.*;


public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagen miMarco = new MarcoImagen();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen(){
		setTitle("Marco con imagen");
		setBounds(750, 300, 400, 400);//posición y luego dimensiones
		LaminaConImagen miLamina = new LaminaConImagen();
		add(miLamina);
	}
	
}


class LaminaConImagen extends JPanel{
	
	/*
	 * podríamos haber declarado dentro del metodo y no sería necesario declararla como private
	 * pero en ese caso no podríamos crear un constructor y usar la variable en dicho constructor
	 */
	/*
	 * el constructor lo podríamos crear sin parámetros y añadir el try catch de forma
	 * que cuando declarásemos un objeto ya cargaríamos en memoria la imagen que va a llevar
	 * aunque no estaría pintada.
	 */
	private Image imagen;
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		File archivoImagen = new File("E:\\Curso Java\\logotipo.jpg");//en el anterior ejemplo poníamos almendros.jpg y el programa acaba en la linea 51
		
		try{
			imagen = ImageIO.read(archivoImagen); //en vez de archivoImagen podríamos haber puesto new File(etc.)
		}catch(IOException e){
			System.out.println("La imgen no se encuentra!");
		}
		
		g.drawImage(imagen, 0,0, null);
		
		//g.copyArea(0, 0, 30, 20, 360, 40);
		
		/*
		 * PARA QUE SE REPITA LA MISMA IMAGEN HASTA EL LUGAR DONDE HEMOS COMENTADO EN LA LINEA ANTERIOR COMENTADA
		 */
		
		for(int i = 0; i <= 360; i+=30){
			for(int j = 0; j <= 40; j+=20){
				
				if(i == 0 && j == 0) continue;//para no volver a copiar la imagen en (0,0) que ya lo habíamos pintado en linea 60
				g.copyArea(0, 0, 30, 20, i, j);
			}
		}
		
		/*
		 * en el caso de que no supiesemos las dimensiones de la imagen podemos usar los metodos 
		 * getWidth(ImageObserver) y getHeight(ImageObserver) de la clase Image
		 * 
		 */
		
		int anchuraImagen = imagen.getWidth(this); //el ImageObserver es la lamina, ya que es el objeto que espera que la imagen sea cargada
		int alturaImagen = imagen.getHeight(this);
		
		/*
		 * ahora podemos sustituir en copyArea el tercer y cuarto parámetros por las dos variables que hemos introducido en las lineas anteriores
		 */
		
	}
	
}
