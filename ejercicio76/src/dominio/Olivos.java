package dominio;

public class Olivos extends Parcela{

	private float arrobas = 0;
	private int precioArroba = 0;
	private float ingresos = 0;
	public Olivos(String nombre, int piesDeArbol, float ingresosTotales, float gastosTotales, float arrobas, int precioArroba){
		super(nombre, piesDeArbol, ingresosTotales, gastosTotales);
		this.arrobas = arrobas;
		this.precioArroba = precioArroba;
	}

	public float getArrobas(){
		return arrobas;
	}

	public void setArrobas(float arrobas){
		this.arrobas = arrobas;
	}

	public int getPrecioArroba(){
		return precioArroba;
	}

	public void setPrecioArroba(int precioArroba){
		this.precioArroba = precioArroba;
	}

	@Override
	public float getIngresos(){
		setIngresosTotales(arrobas * precioArroba);
		return getIngresosTotales();
	}

	@Override
	public String toString(){
		String mensaje = getNombre() + "\n" + "---------------" + 
	}
}
