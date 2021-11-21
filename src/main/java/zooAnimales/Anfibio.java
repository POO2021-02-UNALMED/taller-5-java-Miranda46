package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static int cantidadAnfibios;
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		cantidadAnfibios++;
	}
	
	public static Animal crearRana(String nombre, int edad, String genero) {
		Anfibio Av= new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		listado.add(Av);
		ranas++;
		return Av;
		
		
	}
	public static Animal crearSalamandra(String nombre, int edad, String genero) {
		Anfibio Av= new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", true);
		listado.add(Av);
		salamandras++;
		return Av;
	}
	public ArrayList<Anfibio> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public static int cantidadAnfibios() {
		return cantidadAnfibios;
	}

	public static void setcantidadAnfibios(int cantidadAnfibios) {
		Anfibio.cantidadAnfibios = cantidadAnfibios;
	}
	public static String movimiento() {
		return "saltar";
		
	}
}
