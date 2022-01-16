package dominio;

public abstract class Zapatos{
	private String nombre;
	private float talla;
	private int precioInicial;

	public Zapatos(String nombre, float talla, int precioInicial){
		this.nombre = nombre;
		this.talla = talla;
		this.precioInicial = precioInicial;
	}

	public Zapatos(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
		}
	
	public float getTalla(){
		return talla;
	}

	public void setTalla(float talla){
		this.talla = talla;
	}

	public int getPrecioInicial(){
		return precioInicial;
	}

	public void setPrecioInicial(int precioInicial){
		this.precioInicial = precioInicial;
	}
	
	public abstract int getPrecioFinal();
	
	public boolean equals(Object o){
		if(o == this){
			return true;
		}else if(o instanceof Zapatos){
			Zapatos a = (Zapatos) o;
			if(a.getNombre() == nombre){
				return true;
			}
		}
		return false;
	}
	
	public String toString(){
		return "Nombre: " + nombre + ". Talla: " + talla + ".\nPrecio Inicial: " + precioInicial +
			". precio final: " + getPrecioFinal();
	}
}
