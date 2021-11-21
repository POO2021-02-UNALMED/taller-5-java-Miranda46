package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class test {

	public static void main(String[] args) {
	
		Zoologico zoo = new Zoologico();
		Zona z1 = new Zona();
		Zona z2 = new Zona();
		zoo.agregarZonas(z1);
		zoo.agregarZonas(z2);
		z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
		z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
		z1.agregarAnimales(Mamifero.crearLeon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
		z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
		z1.agregarAnimales(Anfibio.crearRana("test", 11, "M"));
		z2.agregarAnimales(Anfibio.crearSalamandra("test", 11, "M"));
		z2.agregarAnimales(Reptil.crearIguana("test", 11, "M"));
		z2.agregarAnimales(Reptil.crearSerpiente("test", 11, "M"));
		z2.agregarAnimales(Pez.crearSalmon("test", 11, "M"));
		z2.agregarAnimales(Pez.crearBacalao("test454545", 11, "M"));
		Mamifero.crearCaballo("test43434", 11, "M");
		Ave.crearHalcon("test3434", 11, "M");
		Anfibio.crearRana("test3434", 11, "M");
		Reptil.crearIguana("test", 11, "M");
		Pez.crearBacalao("test", 11, "M");
		
				//ok = true;
				System.out.println(zoo.cantidadTotalAnimales() + "13");
				
				System.out.println(zoo.getZona().get(0).getAnimales());
				System.out.println(zoo.getZona().get(0).cantidadAnimales());
			}
			
	    }

	




		
