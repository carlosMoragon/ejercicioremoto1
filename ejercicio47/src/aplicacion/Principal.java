package aplicacion;
import java.util.Scanner;
public class Principal{
	public static void main(String[] args){
		System.out.println("Introduzca un numero: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();
		switch(numero){
			//case 1 es para cuando la variable vale 1
			//break es para que se pare de ejecutar el codico (para delimitar el codigo)
			case 1:
				System.out.println("El numero vale 1");
				break;
			case 2:
				System.out.println("El numero vale 2");
				break;
			//dafault es para que se ejecute si no se han cumplido los casos previos
			default:
				System.out.println("El numero no es ni 1 ni 2");
		}
	}

}
