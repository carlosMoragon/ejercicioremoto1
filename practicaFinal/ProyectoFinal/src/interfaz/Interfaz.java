package interfaz;
import dominio.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
public class Interfaz{

	private static String NOMBRE_FICHERO_CSV = "registro.csv";
	private static String NOMBRE_FICHERO = "registro.txt";

	Registro registro = inicializarRegistro();

	public void procesarPeticion(String sentencia){
		String[] partes = sentencia.split(" ");

		if(partes[0].equalsIgnoreCase("add")){
			if(partes[1].equalsIgnoreCase("Zapatilla") && partes.length == 6){
				Zapatillas zapatilla = new Zapatillas(partes[2], Float.parseFloat(partes[3]), partes[4], Integer.parseInt(partes[5]));
				annadirZapato(zapatilla);
				guardarRegistro(registro);
			}else if(partes[1].equalsIgnoreCase("Zapatos") && partes[2].equalsIgnoreCase("de") && 
					partes[3].equalsIgnoreCase("vestir") && partes.length == 8){
				ZapatosVestir zapatoDeVestir = new ZapatosVestir(partes[4], Float.parseFloat(partes[5]), partes[6], Integer.parseInt(partes[7]));
				annadirZapato(zapatoDeVestir);
				guardarRegistro(registro);
			}else{
				System.out.println("El sistema no ha podido añadir el zapato. Introducelo bien gili******");
			}


		}else if(partes[0].equalsIgnoreCase("delete")){
			if(partes[1].equalsIgnoreCase("zapatilla") && partes.length == 3){
				Zapatillas zapatilla = new Zapatillas(partes[2]);
				registro.deleteZapato(zapatilla);
			}else if(partes[1].equalsIgnoreCase("zapato") && partes[2].equalsIgnoreCase("de") &&
					partes[3].equalsIgnoreCase("vestir") && partes.length == 5){
				ZapatosVestir zapatoVestir = new ZapatosVestir(partes[4]);
				registro.deleteZapato(zapatoVestir);
			}else{
				System.out.println("El sistema no reconoce que zapato quieres eliminar");
			}
		}else if(partes[0].equalsIgnoreCase("help")){
			printHelp();
		}else if(partes[0].equalsIgnoreCase("generarCSV")){
			generarCSV(registro);
		}else if(partes[0].equalsIgnoreCase("list")){
			System.out.println("Estos son los productos que tienes en el registro:\n");
			System.out.println(registro);
		}else if(partes[0].equalsIgnoreCase("edit")){
		}else{
			System.out.println("Pon algo con sentido");
		}
	}

	private static void printHelp(){
		String help = "Opciones del sistema:"
			+ "\n Para añadir un zapato utilice 'add' acompañado de:"
			+ "\n   tipo de zapato: 'zapatilla' o 'zapato de vestir'."
			+ "\n   datos del zapato:"
			+ "\n     Para zapatila: nombre, talla, color, precio inicial."
			+ "\n     Para zapato de vestir: nombre, talla, material, precio inicial.";
		System.out.println(help);
	}

	private static void annadirZapato(Zapatos zapato){
		Registro registro = new Registro();
		registro.addZapato(zapato);
	}

	private static Registro inicializarRegistro(){
		Registro registro = new Registro();
		try{


			File file = new File(NOMBRE_FICHERO);
			Scanner sc = new Scanner(file);
			while(sc.hasNext()){
				String tipoDeZapato = sc.next();
				String nombre = sc.next();
				String talla = sc.next();

				if(tipoDeZapato.equalsIgnoreCase("Zapatilla")){
					String color = sc.next();
					String precioInicial = sc.next();
					int precioFinal = sc.nextInt();
					Zapatillas zapatilla = new Zapatillas(nombre, Float.parseFloat(talla), color, Integer.parseInt(precioInicial));
					registro.addZapato(zapatilla);
				}else{
					String material = sc.next();
					String precioInicial = sc.next();
					int precioFinal = sc.nextInt();
					ZapatosVestir zapatoVestir = new ZapatosVestir(nombre, Float.parseFloat(talla), material, Integer.parseInt(precioInicial));
					registro.addZapato(zapatoVestir);
				}
			}
			sc.close();
		}catch(FileNotFoundException e){
		}
		return registro;
	}
	private static void guardarRegistro(Registro registro){
		try{
			FileWriter fw = new FileWriter(NOMBRE_FICHERO);
			fw.write(registro.toString());
			fw.close();
		}catch(IOException p){
			System.out.println("Ha habido un error al guardar el fichero");
		}
		System.out.println("Se ha guardado el registro con exito");
	}

	private static void generarCSV(Registro registro){
		try{
			FileWriter fw = new FileWriter(NOMBRE_FICHERO);
			fw.write(registro.toCSV());
			fw.close();
		}catch(IOException e){
			System.out.println("No se ha generado el csv");
		}
		System.out.println("Se ha generado el csv");
	}
}
