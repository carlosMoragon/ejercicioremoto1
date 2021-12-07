package dominio;

public class VehiculoTurismo{
	
	private String marca;
	private String modelo;
	private float precioBase;

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

	public float getPrecioBase(){
		return precioBase;
	}

	public void setPrecioBase(float precioBase){
		this.precioBase = precioBase;
	}
	
	public VehiculoTurismo(String marca, String modelo, float precioBase){
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
	}

	public String precioFinal(int numeroDePlazas){
		float precioFinal = 0;
		if(numeroDePlazas <= 5){
			precioFinal += precioBase;
		}else if(numeroDePlazas > 5){
			precioFinal += precioBase + 0.1 * precioBase;
		}
		return "El precio final, del "+ marca + " " + modelo + " con " + numeroDePlazas + " plazas, es de " + precioFinal;
	}

}
