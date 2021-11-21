package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;
import zooAnimales.Mamifero;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private static ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona() {}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
	}
	
	public ArrayList<Animal> getAnimales(){
		return animales;
	}
	
	public void agregarAnimales(Animal animal){
		
		animales.add(animal);
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}

	public int cantidadAnimales() {
		
		return animales.size();
	}
}
