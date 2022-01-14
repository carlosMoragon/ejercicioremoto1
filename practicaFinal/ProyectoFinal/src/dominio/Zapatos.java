package dominio;

public abstract class Zapatos{
	private String nombre;
	private float talla;
	private String color;

	public Zapatos(String nombre, float talla, String color){
		this.nombre = nombre;
		this.talla = talla;
		this.color = color;
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

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String toString(){
		return "Nombre: " + nombre + ". Talla: " + talla + ". Color: " + color + ".";
	}
}
