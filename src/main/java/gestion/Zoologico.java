package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zoologico {
	String nombre;
	String ubicacion;
	ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico(){}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		
		
	}
	
	public int cantidadTotalAnimales() {
		int cont=0;
		int i;
		for (i = 0; i < zonas.size(); i++) {
            cont+=zonas.get(i).getAnimales().size();}
		return cont;
	}
	
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void agregarZonas(Zona zonas) {
		this.zonas.add(zonas);
		
	}
	public ArrayList<Zona> getZona() {	
		return zonas;
	}
}
