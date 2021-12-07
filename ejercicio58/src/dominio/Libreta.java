package dominio;
import java.util.ArrayList;
public class Libreta{
	private ArrayList<Contacto> contactos = new ArrayList<>();

	public ArrayList<Contacto> getContactos(){
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos){
		this.contactos = contactos;
	}

	public void annadirContacto(Contacto contacto){
		contactos.add(contacto);
	}

	public String toString(){
		//StringBuilder nos permite realizar modificaciones en un objeto, no como String que crea un nuevo String al actualizarlo
		StringBuilder mensaje = new StringBuilder(); 
		if(contactos.size() == 0){
			mensaje.append("la libreta está vacia");
		}else {
			//metodo for para recorrer una colección como ArrayList
			for(Contacto contacto: contactos){
				//para añadirle informacion al StringBuilder utilizamos el método .append
				mensaje.append(contacto + "\n");
			}
		}
		return "En tu libreta tienes estos contactos:\n " + mensaje.toString();
	}

	public String toCSV(){
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("nombre, telefono");
		for(Contacto contacto: contactos){
			mensaje.append(contacto + "\n");
		}
		return mensaje.toString();
	}
}
