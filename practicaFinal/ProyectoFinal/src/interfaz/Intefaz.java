package intefaz;
import dominio.*;

public class Intefaz{

	private static String NOMBRE_FICHERO = "registro.csv";

	public void procesarPeticion(String sentencia){
		String[] partes = sentencia.split(" ");

		if(partes[0].equalsIgnoreCase("add")){
			if(partes[1].equalsIgnoreCase("Zapatilla") && partes.length == 6){
				Zapatillas zapatilla = new Zapatillas(partes[2], Float.parseFloat(partes[3]), partes[4], Integer.parseInt(partes[5]));
			}else if(partes[1].equalsIgnoreCase("Zapatos") && partes[2].equalsIgnoreCase("de") && 
					partes[3].equalsIgnoreCase("vestir") && partes.length == 8){
				ZapatosVestir zapato = new ZapatosVestir(partes[4], Float.parseFloat(partes[5]), partes[6], Integer.parseInt(partes[7]));
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

	private static void inicializarRegistro(){
	}
		
}
