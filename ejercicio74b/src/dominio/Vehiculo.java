package dominio;

//abstract es para que no se pueda crear objetos de la clase padre, pero permite crear objetos de las clases hijos
public abstract class Vehiculo{

	private String marca;
	private String modelo;
	private int precioBase;
	
	public Vehiculo(){
		marca = "";
		modelo = "";
		precioBase = 0;
	}
	public Vehiculo(String marca, String modelo, int precioBase){
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
	}

	public String getMarca(){
		return marca;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public String getModelo(){
		return modelo;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public int getPrecioBase(){
		return precioBase;
	}

	public void setPrecioBase(int precioBase){
		this.precioBase = precioBase;
	}
	
	//utilizamos abstract para decir que este metodo es como una plantilla para las clases hijas, pero que no se va a utilizar en si.
	//Al tener un meotodo abstracto la clase tiene que estar definida como abstracta, si no da un error.
	public abstract int precioFinal();

	public String toString(){
		return marca  + ", " +  modelo + " con un precio base de " + precioBase + "€";

	}
}
