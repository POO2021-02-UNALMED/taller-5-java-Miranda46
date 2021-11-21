package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private static int cantidadMamiferos;

	private static ArrayList<Mamifero> listado;
	
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		this.pelaje=pelaje;
		this.patas=patas;
		cantidadMamiferos++;
	}
	
	public static Animal crearCaballo(String nombre, int edad, String genero) {
		Mamifero Av= new Mamifero(nombre, edad, "pradera", genero, true, 4);
		listado.add(Av);
		caballos++;
		return Av;
		
	}
	public static Animal crearLeon(String nombre, int edad, String genero) {
		Mamifero Av= new Mamifero(nombre, edad, "selva", genero, true, 4);
		listado.add(Av);
		leones++;
		return Av;
	}
	
	public ArrayList<Mamifero> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	public static int getcantidadMamiferos() {
		return cantidadMamiferos;
	}

	public static void setcantidadMamiferos(int cantidadMamiferos) {
		Mamifero.cantidadMamiferos = cantidadMamiferos;
	}
		
	
	
	
	public Mamifero() {}
}