package interfaz;
import java.util.Scanner;

public static void final int ESTADO_ANNADIR_CONTACTO = 0;
public static void final int ESTADO_FINAL = 1;

public class Interfaz{
	
	int estado = -1;

	Contacto numeroDeTelefono = "";
	Contacto nombre = "";

	public void String procesarPeticion(String sentencia){
		while(estado == ESTADO_ANNADIR_CONTACTO){
			String[] split = sentencia.splt(" ");
			if(split.substring(3,6).equalsIgnoreCase("add")){
				split.charAt(4) = nombre;
				split.charAt(5,13) = numeroDeTelefono;
				estado = ESTADO_FINAL;
			}else if(split.substring(3,6).equalsIgnoreCase("list")){
				printList();
			}else if(split.substring(3,6).equalsIgnoreCase("help")){
				printHelp();
			}
		}
	}
	private static void printHelp(){
		System.out.println("Aqui tienes tu ayuda");
		estado = ESTADO_FINAL;
	}

	private static void printList(){
		for(int i; i< array.length; i++){
			System.out.println(array[i]);
			estado = ESTADO_FINAL;
		}
}
