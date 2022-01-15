package intefaz;
import dominio.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class Intefaz{

	private static String NOMBRE_FICHERO = "registro.csv";

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
				System.out.println("El sistema no reconoce que zapato quieres añadir.");
				printHelp();
			}


		}
	}

	private static String printHelp(){
		String help = "Opciones del sistema:"
			+ "\n Para añadir un zapato utilice 'add' acompañado de:"
			+ "\n   tipo de zapato: 'zapatilla' o 'zapato de vestir'."
			+ "\n   datos del zapato:"
			+ "\n     Para zapatila: nombre, talla, color, precio inicial."
			+ "\n     Para zapato de vestir: nombre, talla, material, precio inicial.";
		return help;
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
				float talla = sc.nextFloat();
				if(tipoDeZapato.equalsIgnoreCase("Zapatilla")){
					String color = sc.next();
					int precioInicial = sc.nextInt();
					int precioFinal = sc.nextInt();
					Zapatillas zapatilla = new Zapatillas(nombre, talla, color, precioInicial);
					registro.addZapato(zapatilla);
				}else{
					String material = sc.next();
					int precioInicial = sc.nextInt();
					int precioFinal = sc.nextInt();
					ZapatosVestir zapatoVestir = new ZapatosVestir(nombre, talla, material, precioInicial);
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
			fw.write(registro.toCSV());
			fw.close();
			System.out.println("Se ha generado un CSV");
		}catch(IOException e){
		}
	}

}
