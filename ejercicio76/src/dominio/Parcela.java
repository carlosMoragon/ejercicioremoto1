package dominio;

public abstract class Parcela{

	private String nombre = "";
	private int piesDeArbol = 0;
	private float ingresosTotales = 0;
	private float gastosTotales = 0;
	private float beneficios = 0;
	
	public Parcela(String nombre, int piesDeArbol, float ingresosTotales, float gastosTotales, float beneficios){
		this.nombre = nombre;
		this.piesDeArbol = piesDeArbol;
		this.ingresosTotales = ingresosTotales;
		this.gastosTotales = gastosTotales;
		this.beneficios = beneficios;
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
                return beneficios;
        }

        public void setBeeficios(float beneficios){
                this.beneficios = beneficios;
        }
	
	public abstract float getIngresos();
}
