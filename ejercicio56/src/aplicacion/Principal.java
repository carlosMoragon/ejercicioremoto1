package aplicacion;
import interfaz.*;
import java.util.Scanner;
public class Principal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Interfaz interfaz = new Interfaz();
		interfaz.procesarPeticion(sc.next());
	}
}
