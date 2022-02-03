package aplicacion;
import dominio.*;
import java.util.Scanner;

public class Principal{
	public static void main(String[] args){
		/*El objetivo es obtener el interes simple a partir del capital, del redito y el tiempo
		 */
		Scanner sc = new Scanner(System.in);
		String datos = sc.next();

		datos = datos.replace(" ","");

		String[] partes = datos.split(",");

		InteresSimple interesSimple = new InteresSimple();

		System.out.println(interesSimple.getInteresSimple(partes[0],partes[1],partes[2]));
	}
}
