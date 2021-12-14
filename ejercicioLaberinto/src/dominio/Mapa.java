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
			String columnas[] = filas[0].split("");
			
			String [][] array = new String[filas.length][columnas.length];


			for(int i = 0; i < filas.length; i++){
				String[] linea = filas[i].split("");
				for(int j = 0; j < linea.length; j++){
					array[i][j] = linea[j];
				}
			}
			
			for(int i = 0; i < array.length; i++){
				for(int j = 0; j < array.length; j++){
					if(j != columnas.length - 1){
						lectura2 += array[i][j];
					}else{
						lectura2 += "\n";
					}
				}
			}
/*
			for(int i = 0; i < lineas.length; i++){
				for(int j = 0; j < array.lenght; j++){
					lectura2 = array[i][j];
				}
			}
*/
			System.out.println(lectura2);
			sc.close();

		}catch(FileNotFoundException f){
		}

	}
}
