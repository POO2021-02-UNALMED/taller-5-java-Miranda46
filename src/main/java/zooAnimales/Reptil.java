package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private static int cantidadReptiles;

	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {cantidadReptiles++;}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		cantidadReptiles++;
	}
	
	public static Animal crearIguana(String nombre, int edad, String genero) {
		Reptil Av= new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		listado.add(Av);
		iguanas++;
		return Av;
		
	}
	public static Animal crearSerpiente(String nombre, int edad, String genero) {
		Reptil Av= new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		listado.add(Av);
		serpientes++;
		return Av;
	}
	
	public ArrayList<Reptil> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public static int cantidadReptiles() {
		return cantidadReptiles;
	}

	public static void setcantidadReptiles(int cantidadReptiles) {
		Reptil.cantidadReptiles = cantidadReptiles;
	}
	public String movimiento() {
		return "reptar";
		
	}
}
	
	


	
	