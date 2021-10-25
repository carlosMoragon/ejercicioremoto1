package aplicacion;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class Principal{
	public static void main(String[] args){
	//Sytem.in para pedir texto a la consola
	Scanner sc = new Scanner(System.in);
/*	String texto = "";
	while(sc.hasNext()){
		texto += sc.next() + " ";
	}
	System.out.println(texto);

	}*/
	System.out.println("Introduzca su nombre: ");
	String nombre = sc.next();
	System.out.println("Su nombre es " + nombre);
	sc.close();
}

}
