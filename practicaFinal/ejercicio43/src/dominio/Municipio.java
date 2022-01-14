package dominio;

import java.util.ArrayList;
public class Municipio{
	private String nombre;
	private int numeroDeHabitantes;

	public Municipio(String nombre){
		this.nombre = nombre;
	}

	ArrayList<Localidad> localidades = new ArrayList<>();

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void addLocalidad(Localidad localidad){
		localidades.add(localidad);
	}
	
	public int getNumeroDeHabitantes(){
		for(Localidad localidad: localidades){
			numeroDeHabitantes += localidad.getNumeroDeHabitantes();
		}
		return numeroDeHabitantes;
	}

	public String toString(){
		StringBuilder mensaje = new StringBuilder();
		for(Localidad localidad: localidades){
			mensaje.append(localidad/*.getNombre()*/ + "\n");
		}

		return nombre + " tiene a:\n" + mensaje + "como localidades, y un total de habitantes de " + getNumeroDeHabitantes();
	}
}

