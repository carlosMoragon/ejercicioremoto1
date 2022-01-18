package aplicacion;
import interfaz.*;
public class Principal{
	public static void main(String[] args){
		String sentencia = "";

		for(int i = 0; i < args.length ; i++){
			sentencia += args[i] + " ";
		}
		Interfaz interfaz = new Interfaz();
		interfaz.procesarPeticion(sentencia);
	}
}
