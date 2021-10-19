package dominio;

public class Curso{
	
	private String nombre;
	private ArrayList<Asignatura> asignaturas = new ArrayList<>();
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public ArrayList<Asignatura> getAsignaturas(){
		return asignaturas;
	}
	
	public void setAsignaturas(ArrayList<Asignatura> asignaturas){
		this.asignaturas = asignaturas;
	}
