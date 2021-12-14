package dominio;

public class Vehiculo{

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

	public int precioFinal(){
		return precioBase;
	}

	public String toString(){
		return marca  + ", " +  modelo + " con un precio base de " + precioBase + "€";

	}
}
