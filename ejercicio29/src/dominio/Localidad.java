package dominio;
/**
 *Esta clase define una Localidad con su nombre y sus habitantes
 *@author Carlos Moragón
 */

public class Localidad{
	private String nombre;
	private int numeroDeHabitantes;
        /**
	 *Para obtener el nombre de la localidad
	 *@author Carlos Moragón
	 */
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	/**
	 * Para obtener el numero de habitantes 
	 * @author Carlos Moragón
	 */
	public int getNumeroDeHabitantes(){
		return numeroDeHabitantes;
	}
	public void setNumeroDeHabitantes(int numeroDeHabitantes){
		this.numeroDeHabitantes = numeroDeHabitantes;
	}
	public String toString(){
		return nombre + " " + numeroDeHabitantes + " habitantes";
	}
}
