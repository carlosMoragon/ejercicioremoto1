package dominio;

import java.util.ArrayList;
public class Provincia{
	private String nombre;
	private int numeroDeHabitantes;

	public Provincia(String nombre){
		this.nombre = nombre;
	}

	ArrayList<Municipio> municipios = new ArrayList<>();

	public void addMunicipio(Municipio municipio){
		municipios.add(municipio);
	}

	public int getNumeroDeHabitantes(){
		for(Municipio municipio: municipios){
			numeroDeHabitantes += municipio.getNumeroDeHabitantes();
		}
		return numeroDeHabitantes;
	}

	public String toString(){
		StringBuilder mensaje = new StringBuilder();
		for(Municipio municipio: municipios){
			mensaje.append(municipio/*.getNombre()*/ + "\n");
		}

		return nombre + " tiene estos municipios: \n" + mensaje + "con un numero de habitantes de " + getNumeroDeHabitantes();
	}
}
