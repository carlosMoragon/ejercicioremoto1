package dominio;
import dominio.Localidad;
public class Persona{
	/** 
	 *Declaramos la variables que vamos a usar en esta clase
	 *@author Carlos Moragón
	 */
	String nombre;
	Localidad lugarDeNacimiento;

	/**
	 * Dado que las variables estan en privado debemos hacer getter y setters
	 * @author Carlos Moragón
	 */
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public Localidad getLugarDeNacimiento(){
		return lugarDeNacimiento;
	}
	public void setLugarDeNacimiento(Localidad
			localidad){
		lugarDeNacimiento = localidad;
			}
	public String toString(){
		return nombre + ", " + lugarDeNacimiento;
	}
}
