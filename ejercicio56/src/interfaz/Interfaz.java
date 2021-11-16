package interfaz;
import dominio.*;
import java.lang.ArrayIndexOutOfBoundsException;

public class Interfaz{
		Libreta libreta = new Libreta();
	public void procesarPeticion(String sentencia){
		String[] partes = sentencia.split(" ");
		if(partes[0].equalsIgnoreCase("add")){
			Contacto contacto = new Contacto(partes[1], partes[2]);
			libreta.annadirContacto(contacto);
		}else if(partes[0].equalsIgnoreCase("list")){
			printList();
		}else if(partes[0].equalsIgnoreCase("help")){
			printHelp();
		}
	}
	private void printHelp(){
		System.out.println("Aqui tienes tu ayuda");
	}

	private void printList(){
		System.out.println(libreta);
	}
}
