package dominio;

public abstract class Parcela{

	private String nombre = "";
	private int piesDeArbol = 0;
	private float ingresosTotales = 0;
	private float gastosTotales = 0;
	private float beneficios = 0;
	
	public Parcela(String nombre, int piesDeArbol, float ingresosTotales, float gastosTotales){
		this.nombre = nombre;
		this.piesDeArbol = piesDeArbol;
		this.ingresosTotales = ingresosTotales;
		this.gastosTotales = gastosTotales;
	}


	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public int getPiesDeArbol(){
		return piesDeArbol;
	}

	public void setPiesDeArbol(int piesDeArbol){
		this.piesDeArbol = piesDeArbol;
	}

	public float getIngresosTotales(){
		return ingresosTotales;
	}

	public void setIngresosTotales(float ingresosTotales){
		this.ingresosTotales = ingresosTotales;
	}

 	public float getGastosTotales(){
                return gastosTotales;
        }

        public void setGastosTotales(float gastosTotales){
                this.gastosTotales = gastosTotales;
        }

	public float getBeneficios(){
		beneficios = getIngresos() - gastosTotales;
		return beneficios;
	}

	public abstract float getIngresos();

	public abstract String toString(){
                String mensaje = getNombre() + "\n" + "---------------" +
                        "\n" + "Numero de pies de árbol: " + getPiesDeArbol() +
                        "\n" + "Ingresos totales de la parcela: " + getIngresos() +
                        "\n" + "Gastos totales en la parcela: " + getGastosTotales() +
                        "\n" + "Beneficios de la parcela: " + getBeneficios;
		return mensaje;
	}
}
