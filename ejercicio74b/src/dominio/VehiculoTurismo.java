package dominio;

//aplicamos herencia poniendo que VehiculoTurismo extiende de Vehiculo. Vehiculo es el padre y VehiculoTurismo hereda sus atributos
public class VehiculoTurismo extends Vehiculo{
	private int numeroDePlazas;

	public VehiculoTurismo(String marca, String modelo, int precioBase, int numeroDePlazas){
		//Se tiene que llamar a los getter y setter dado que aunque sea la clase padre los atributos son privados
		setMarca(marca);
		setModelo(modelo);
		setPrecioBase(precioBase);
		this.numeroDePlazas = numeroDePlazas;
	}
	
	public int getNumeroDePlazas(){
		return numeroDePlazas;
	}

	public void setNumeroDePlazas(int numeroDePlazas){
		this.numeroDePlazas = numeroDePlazas;
	}

	public int precioFinal(){
		int precioFinal = getPrecioBase();
		if(numeroDePlazas > 5){
			precioFinal += 0.1 * getPrecioBase() * (numeroDePlazas - 5);
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
		return getMarca()  + ", " +  getModelo() + ", con un numero de plazas " + numeroDePlazas + " con un precio base de " + getPrecioBase() + "€, y con un precio final de " + precioFinal() + "€";

	}
}
