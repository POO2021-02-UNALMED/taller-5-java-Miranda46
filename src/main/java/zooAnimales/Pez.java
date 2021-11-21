package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static int cantidadPeces;
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {cantidadPeces++;}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		cantidadPeces++;
	}
	
	public static Animal crearSalmon(String nombre, int edad, String genero) {
		Pez Av= new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		listado.add(Av);
		salmones++;
		return Av;
		
	}
	public static Animal crearBacalao(String nombre, int edad, String genero) {
		Pez Av= new Pez(nombre, edad, "oceano", genero, "gris", 6);
		listado.add(Av);
		bacalaos++;
		return Av;
	}
	public ArrayList<Pez> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public static int cantidadPeces() {
		return cantidadPeces;
	}

	public static void setcantidadPeces(int cantidadPeces) {
		Pez.cantidadPeces = cantidadPeces;
	}
	public String movimiento() {
		return "nadar";
		
	}
}

	