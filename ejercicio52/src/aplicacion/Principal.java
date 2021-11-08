package aplicacion;

import dominio.*;
public class Principal{
	public static void main(String[] args){

		Localidad pinar = new Localidad("Pinar de chamartin", 100);
		pinar.setNombre("Pinar de chamartin");
		pinar.setNumeroDeHabitantes(100);

		Localidad moncloa = new Localidad("Moncloa", 200);
		moncloa.setNombre("Moncloa");
		moncloa.setNumeroDeHabitantes(200);

		Localidad moraleja = new Localidad("La moraleja", 50);
		moraleja.setNombre("LA moraleja");
		moraleja.setNumeroDeHabitantes(50);

		Localidad encinar = new Localidad("El encinar de los reyes", 70);
		encinar.setNombre("El encinar de los reyes");
		encinar.setNumeroDeHabitantes(70);

		Municipio muni1 = new Municipio();
		muni1.setNombre("Madrid");
		muni1.addLocalidades(pinar);
		muni1.addLocalidades(moncloa);

		Municipio muni2 = new Municipio();
		muni2.setNombre("Alcobendas");
		muni2.addLocalidades(moraleja);
		muni2.addLocalidades(encinar);

		Provincia prov = new Provincia();
		prov.setNombre("Comunidad de Madrid");
		prov.addMunicipios(muni1);
		prov.addMunicipios(muni2);
		System.out.println(prov);
	}


}
