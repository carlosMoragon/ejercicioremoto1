package dominio;

public class Director extends Participantes{
	
	public Director(String nombre){
		super(nombre);
	}

	@Override
	public String toString(){
		return getNombre() + ", director" + "\n";
	}
}
