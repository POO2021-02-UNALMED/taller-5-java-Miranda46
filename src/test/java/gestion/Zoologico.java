package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zoologico {
	String nombre;
	String ubicacion;
	ArrayList<Zona> zonas;
	

	public int cantidadTotalAnimales() {
		return Animal.getTotalAnimales();
	}
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void agregarZonas(Zona z1) {
		zonas.add(z1);
		
	}
	public ArrayList<Zona> getZona() {	
		return zonas;
	}
}
