package dominio;
import java.util.ArrayList;
public class Libreta{
	ArrayList<Contacto> contactos = new ArrayList<>();

	public void annadirContacto(Contacto contacto){
		contactos.add(contacto);
	}

	public String toString(){
		for(int i = 0; i< contactos.size(); i++){
			contactos.get(i);
		}
		return "En tu libreta tienes estos contactos: " + "\n" + contactos;
	}
}
