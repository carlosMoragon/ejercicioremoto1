package interfaz;
import dominio.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Interfaz{
	private static String NOMBRE_FICHERO = "libreta.txt";
	private static String NOMBRE_FICHERO_CSV = "libreta.csv";
	Libreta libreta = inicializarLibreta();
	public void procesarPeticion(String sentencia){
		String[] partes = sentencia.split(" ");
		if(partes[0].equalsIgnoreCase("add") && partes.length == 3){
			Contacto contacto = new Contacto(partes[1], partes[2]);
			libreta.annadirContacto(contacto);
			guardarLibreta(libreta);
		}else if(partes[0].equalsIgnoreCase("list")){
			System.out.println("Estos son los contactos que tienes en la libreta:\n");
			printList();
		}else if(partes[0].equalsIgnoreCase("help")){
			printHelp();
		}else if(palabras[0].equals("toCSV")){
			libreta.generarCSV();
		}else{
			printHelp();
		}

	}

	private static void guardarLibreta(Libreta libreta){
		try{
			FileWriter fw = new FileWriter(NOMBRE_FICHERO);
			fw.write(libreta.toString());
			fw.close();
		}catch(IOException p){
			System.out.println("Ha habido un error al guardar el fichero");
		}
		System.out.println("Se ha guardado la libreta con exito");
	}

	private void printList(){
		System.out.println(libreta);
	}
	private static void printHelp(){
		System.out.println("Las operaciones posibles son las siguientes:\n- Añadir contacto: ‘java -jar ap-personas.jar add <nombre> <teléfono>‘\nPor ejemplo,\njava -jar ap-personas.jar add Pepe 654321234\n- Mostrar contactos:\njava -jar ap-personas.jar list\n- Mostrar esta ayuda:\njava -jar ap-personas.jar help");
	}
	private static Libreta inicializarLibreta(){
		Libreta libreta = new Libreta();
		try{
			File file = new File(NOMBRE_FICHERO);
			Scanner sc = new Scanner(file);
			while(sc.hasNext()){
				String nombre = sc.next();
				String telefono = sc.next();
				Contacto contacto = new Contacto(nombre, telefono);
				libreta.annadirContacto(contacto);
			}
			sc.close();
		}catch(FileNotFoundException e){
		}
		return libreta;
	

	}

	private static void generarCSV(Libreta libreta){
		try{
			FileWriter fw = new FileWriter(NOMBRE_FICHERO_CSV);
			fw.write(libreta.toCSV);
			fw.close();
			System.out.println("Se ha generado el fichero CSV");
		}catch(IOException e){
		}
	}
}
