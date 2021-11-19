package interfaz;
import dominio.*;

public class Interfaz{
	//FileWriter fw = new FileWriter("libreta.jar");
	Libreta libreta = new Libreta();
	public void procesarPeticion(String sentencia){
		String[] partes = sentencia.split(" ");
		if(partes[0].equalsIgnoreCase("add")){
			Contacto contacto = new Contacto(partes[1], partes[2]);
			libreta.annadirContacto(contacto);
			/*fw.writer(contacto);
			fw.close();*/
		}else if(partes[0].equalsIgnoreCase("list")){
			printList();
		}else if(partes[0].equalsIgnoreCase("help")){
			printHelp();
		}else{
			printHelp();
		}

	}
	private void printList(){
		System.out.println(libreta);
	}
	private static void printHelp(){
		System.out.println("Las operaciones posibles son las siguientes:\n- Añadir contacto: ‘java -jar libreta.jar add <nombre> <teléfono>‘\nPor ejemplo,\njava -jar libreta.jar add Pepe 654321234\n- Mostrar contactos:\njava -jar libreta.jar list\n- Mostrar esta ayuda:\njava -jar libreta.jar help");
	}
}
