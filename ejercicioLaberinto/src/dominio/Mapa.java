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


			String filas[] = lectura.split("\n");
			String read[] = filas[0].split("");
			
			String [][] array = new String[filas.length][read.length];


			String[] lineas = lectura.split("\n");
			
			for(int i = 0; i < lineas.length; i++){
				String[] linea = lineas[i].split("");
				for(int j = 0; j < linea.length; j++){
					array[i][j] = linea[j];
				}
			}
			/*for(int i = 0; i < array.length; i++){
				lectura2 += array[i] + "\n";
			}*/

			for(int i = 0; i < lineas.length; i++){
				for(int j = 0; j < linea.lenght; j++){
					lectura2 = array[i][j];
				}
			}

			System.out.println(lectura2);
			sc.close();

		}catch(FileNotFoundException f){
		}

	}
}
