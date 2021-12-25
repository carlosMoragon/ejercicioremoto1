package dominio;

public abstract class Parcela{

	private String nombre = "";
	private int piesDeArbol = 0;
	private double ingresosTotales = 0.00;
	private double gastosTotales = 0.00;
	private double beneficios = 0.00;
	
	public Parcela(String nombre, int piesDeArbol, double ingresosTotales, double gastosTotales, double beneficios){
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

	public double getIngresosTotales(){
		return ingresosTotales;
	}

	public void setIngresosTotales(double ingresosTotales){
		this.ingresosTotales = ingresosTotales;
	}

 	public double getGastosTotales(){
                return gastosTotales;
        }

        public void setGastosTotales(double gastosTotales){
                this.gastosTotales = gastosTotales;
        }

 	public double getBeneficios(){
                return beneficios;
        }

        public void setBeeficios(double beneficios){
                this.beneficios = beneficios;
        }

}
