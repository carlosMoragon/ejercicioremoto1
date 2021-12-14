package dominio;

//Como la clase es hija de Vehiculo tiene que tener si o si los metodos abstractos de la clase padre. Ejemplo el metodo precioFinal().
public class Furgoneta extends Vehiculo{
	private double capacidad;

	public Furgoneta(String marca, String modelo, int precioBase, double capacidad){
		//ponemos super (en la primera linea) el que nos premite coger metodos y al constructor de la clase padre
		//aqui el super llama al constructor de la clase padre
		super(marca,modelo,precioBase);
		/*
		setMarca(marca);
		setModelo(modelo);
		setPrecioBase(precioBase);
		*/
		this.capacidad = capacidad;
	}
	
	public double getCapacidad(){
		return capacidad;
	}

	public void setCapacidad(double capacidad){
		this.capacidad = capacidad;
	}
	
	//se pone override para los metodos que estamos sobreescribiendo, si nos equivocamos en la sintaxis q nos avise el compilador
	@Override
	public int precioFinal(){
		//Math.pow para elevar algo a algo
		//como se pierde precision tenemos que hacer el cambio a int
		int precioFinal = (int)(getPrecioBase() * Math.pow(capacidad,1.0/3.0) /2);
		return precioFinal;
	}
	
	@Override
	public String toString(){
		return getMarca()  + ", " +  getModelo() + ", con una capacidad de " + capacidad + "m3, con un precio base de " + getPrecioBase() + "€, y con un precio final de " + precioFinal() + "€";

	}
}
