package dominio;

public class VehiculoTurismo{

	private String marca;
	private String modelo;
	private int precioBase;
	private int numeroDePlazas;

	public VehiculoTurismo(String marca, String modelo, int precioBase, int numeroDePlazas){
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.numeroDePlazas = numeroDePlazas;
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
		int precioFinal = precioBase;
		if(numeroDePlazas > 5){
			precioFinal += 0.1 * precioBase * (numeroDePlazas - 5);
		}
		/*
		   if(numeroDePlazas <= 5){
		   precioFinal += precioBase;
		   }else if(numeroDePlazas > 5){
		   precioFinal += precioBase + 0.1 * precioBase * (numeroDePlazas - 5);
		   }*/

		return precioFinal;
	}

	public String toString(){
		return marca  + ", " +  modelo + ", con un numero de plazas " + numeroDePlazas + " con un precio base de " + precioBase + "€, y con un precio final de " + precioFinal() + "€";

	}
}
