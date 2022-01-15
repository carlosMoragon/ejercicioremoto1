package dominio;

public class Zapatillas extends Zapatos{
	
	private String color;
	private int precioFinal;

	public Zapatillas(String nombre, float talla, String color, int precioInicial){
		super(nombre, talla, precioInicial);
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}
	
	//si son azules descuento del 25% y si son rojas descuento del 50%
	@Override
	public int getPrecioFinal(){
		if(color.equalsIgnoreCase("azul")){
			precioFinal = getPrecioInicial() * 25 / 100;
		}else if(color.equalsIgnoreCase("rojo")){
			precioFinal = getPrecioInicial() * 50 / 100;
		}else{
			precioFinal = getPrecioInicial();
		}
		return precioFinal;
	}

	@Override
	public String toString(){
		return "Zapatillas:\nNombre: " + getNombre() + ".\nTalla: " + getTalla() + ".\nColor: " + color + ".\n" +
			"Precio Inicial: " + getPrecioInicial() + ".\nPrecio Final: " + getPrecioFinal() + ".";
	}

}
