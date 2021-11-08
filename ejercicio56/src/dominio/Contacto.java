package dominio;

public class Contacto{
	private String nombre;
	private int numeroDeTelefono;
	
	public Contacto(String nombre, int numeroDeTelefono){
		this.nombre = nombre;
		this.numeroDeTelefono = numeroDeTelefono;
	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public int getNumeroDeTelefono(){
		return numeroDeTelefono;
	}
	public void setNumeroDeTelefono(int numeroDeTelefono){
		this.numeroDeTelefono = numeroDeTelefono;
	}

	public String toString(){
		return nombre + " tiene de numero de telefono el: " + numeroDeTelefono;
	}
}
