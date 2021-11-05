package aplicacion;
import java.util.Scanner;
public class Principal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("mete una palabra");
		String palabra1 = sc.next();
		System.out.println("mete otra palabra");
		String palabra2 = sc.next();

		if(palabra1.toUpperCase().equals(palabra2.toUpperCase())){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		//otra opcion .compareTo() te devuelve un numero que es la resta de las 2 varables
		//if(palabra1.equalsIgnoreCase(palabra2))  .equalsIgnoreCase() es ignorando mayusculas y minusculas

	}
}
