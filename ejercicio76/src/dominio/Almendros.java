package dominio;

public class Almendros extends Parcela{
	private float kilosAlmendra = 0;
	private float escandallo = 0;
	private int precioAlmendraLimpia = 0;
 	public Almendros(String nombre, int piesDeArbol, float ingresosTotales, float gastosTotales, float kilosAlmendra, float escandallo, int precioAlmendraLimpia){
		super(nombre, piesDeArbol, ingresosTotales, gastosTotales);
		this.kilosAlmendra = kilosAlmendra;
		this.escandallo = escandallo;
		this.precioAlmendraLimpia = precioAlmendraLimpia;
	}

	public float getKilosAlmendra(){
		return kilosAlmendra;
	}

	public void setKilosAlmendra(float kilosAlmendra){
		this.kilosAlmendra = kilosAlmendra;
	}

        public float getEscandallo(){
                return escandallo;
        }

        public void setEscandallo(float escandallo){
                this.escandallo = escandallo;
        }

        public int getPrecioAlmedraLimpia(){
                return precioAlmendraLimpia;
        }

        public void setPrecioAlmendraLimpia(int precioAlmendraLimpia){
                this.precioAlmendraLimpia = precioAlmendraLimpia;
        }
	
	@Override
	public float getIngresos(){
		setIngresosTotales(kilosAlmendra * escandallo * precioAlmendraLimpia);
		return getIngresosTotales();
	}

}
