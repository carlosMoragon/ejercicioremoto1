package dominio;

public class Asignatura{
	private int id;
	private String nombre;
	private int curso;
	private int numeroAlumnos;

	public Asignatura(int id, String nombre, int curso, int numeroAlumnos){
		this.nombre = nombre;
		this.id = id;
		this.curso = curso;
		this.numeroAlumnos = numeroAlumnos;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String toString(){
		return nombre;
	}
	/*
	//La sintaxis es la siguiente
	public boolean equals(Object o){
		//sirve para comparar otros objetos con si mismo
		//vamos a editarlo para que dos objetos sean iguales si sus nombres son iguales
		
		//En la siguiente linea convierte el objeto o a la clase asignatura
		Asignatura a = (Asignatura) o;
		//En la siguiente linea igualamos el nombre del objeto a (que es el objeto o convertido a la clase Asignatura, y por eso lo tenemos que llamar con el getNombre(), por que es privado) con 
		//la variable nombre de nuestra clase asignatura
		if(a.getNombre().equals(nombre)){
			return true;
		}
		return false;
	}*/

	public boolean equals(Object o){
		Asignatura a = (Asignatura) o;
		if(a.getId() == id){
			return true;
		}
		return false;
	}

}
