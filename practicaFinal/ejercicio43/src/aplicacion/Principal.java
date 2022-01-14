package aplicacion;
import dominio.*;
public class Principal{
	public static void main(String[] args){
		System.out.println("--------------------------------");
		Localidad madrid = new Localidad("Madrid",30000);
		//System.out.println(madrid);
		Localidad moraleja = new Localidad("La Moraleja", 3000);
		Localidad pinar = new Localidad("Pinar de Chamartin", 5000);	
	

		Municipio municipio = new Municipio("municipio1");
		Municipio muni = new Municipio("municipio2");

		municipio.addLocalidad(madrid);
		municipio.addLocalidad(moraleja);
		
		muni.addLocalidad(pinar);
		//System.out.println(municipio);
		
		Provincia prov = new Provincia("Comunidad de Madrid");
		prov.addMunicipio(municipio);
		prov.addMunicipio(muni);

		System.out.println(prov);

	}
}
