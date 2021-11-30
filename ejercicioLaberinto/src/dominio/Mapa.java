package dominio;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Mapa{
	private static String NOMBRE_MAPA = "lab5.txt";


	public String leerMapa(){
		String lectura = "";
		try{
			File file = new File(NOMBRE_MAPA);
			Scanner sc = new Scanner(file);

			while(sc.hasNext()){
				lectura += sc.nextLine();
			}

			String filas[] = lectura.split("\n");
			String lectura2 = lectura.replace(lectura.substring(lectura.indexOf("\n", filas.length)), "");
			String columnas[] = lectura2.split("");

			String [][] array = new String[filas.length][columnas.length];
			
			lectura = "";

			for(int i = 0; i < array.length; i++){
				lectura += array[i];
			}

			//System.out.print(lectura);
			sc.close();
		}catch(FileNotFoundException f){
			System.out.println("vaya");
		}
		return lectura;
	}

}
