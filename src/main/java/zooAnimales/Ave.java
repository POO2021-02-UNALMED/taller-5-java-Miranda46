package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static int cantidadAves;
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
	cantidadAves++;
	nuevoAnimal();}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		this.colorPlumas=colorPlumas;
		cantidadAves++;
		nuevoAnimal();
	}
	
	public ArrayList<Ave> getListado() {
		return listado;
	}

	public static Animal crearHalcon(String nombre, int edad, String genero) {
		Ave Av= new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		listado.add(Av);
		halcones++;
		return Av;
		
	}
	public static Animal crearAguila(String nombre, int edad, String genero) {
		Ave Av= new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		listado.add(Av);
		aguilas++;
		return Av;
	}
		
	
	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
	}


	public String getColorPlumas() {
		return colorPlumas;
	}


	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public static int cantidadAves() {
		return cantidadAves;
	}

	public static void setcantidadAves(int cantidadAves) {
		Ave.cantidadAves = cantidadAves;
	}
	public String movimiento() {
		return "volar";
		
	}



	
	
}