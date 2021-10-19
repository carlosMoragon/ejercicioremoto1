package dominio;
import java.util.ArrayList;
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

	public void addAsignatura(Asignatura asignatura){
		asignaturas.add(asignatura);
	}
	public String toString(){
		String mensaje = "Este curso " + nombre + " tiene estas asignaturas:\n";
		for(int i = 0; i < asignaturas.size(); i++){
			mensaje += asignaturas.get(i) + "\n";
		}
		return mensaje;

	}
}
