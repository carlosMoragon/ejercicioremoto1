package dominio;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Mapa{
	private static String NOMBRE_MAPA = "lab5.txt";
	private String lectura = "";
	private String lectura2 = "";

	public void leerMapa(){
		try{
			File file = new File(NOMBRE_MAPA);
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()){
				lectura += sc.nextLine() + "\n";
			}

			//System.out.println(lectura);	

			/*String array1[] = lectura.split("");
			array1 = lectura.split("\n");
			*/

			String filas[] = lectura.split("\n");
			String read[] = filas[0].split("");
			
			/*String read[] = lectura.split("");

			for(int i = lectura.indexOf("\n"); i < read.length - i++; i++){
				lectura2 += lectura.replace(read[i], "");
			}

			String columnas[] = lectura2.split("");*/

			String [][] array = new String[filas.length][read.length];

			//array[][] = {
			
			for(int i = 0; i<array.length; i++){
				array[i] = array1[i];
			}

			for(int i = 0; i < array.length; i++){
				lectura2 += array[i] + "\n";
			}

			//System.out.println(filas.length);
			//System.out.println(read.length);

			System.out.println(lectura2);
			sc.close();

		}catch(FileNotFoundException f){
		}

	}
}
