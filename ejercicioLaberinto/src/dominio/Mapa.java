package dominio;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Mapa{
	private static String NOMBRE_MAPA = "lab5.txt";
	private String lectura = "";
	private String lectura2 = "";
	private String WALL = "█";
	private String[][] mapa = leerMapa();

	public String[][] leerMapa(){
		try{
			File file = new File(NOMBRE_MAPA);
			Scanner sc = new Scanner(file);

			while(sc.hasNext()){
				lectura += sc.nextLine() + "\n";
			}

			sc.close();
		}catch(FileNotFoundException f){
		}
		String filas[] = lectura.split("\n");
		String columnas[] = filas[0].split("");

		String [][] mapa = new String[filas.length][columnas.length];
		//array = new String[filas.length][columnas.length];


		for(int i = 0; i < filas.length; i++){
			String[] linea = filas[i].split("");
			for(int j = 0; j < linea.length; j++){
				mapa[i][j] = linea[j];
			}
		}
//		System.out.println(filas.length);

		for(int i = 0; i < filas.length; i++){
			for(int j = 0; j < columnas.length; j++){
				if(mapa[i][j].equals("X")){
					lectura2 += mapa[i][j].replace("X", "█");
					//lectura2 += array[i][j];
				}else{
					lectura2 += mapa[i][j];
				}
				if(j == columnas.length - 1){
					lectura2 += "\n";
				}
			}
		}




		System.out.println(lectura2);

		return mapa;
	}
/*
	public void move(){
		//	String[][] mapa = array;
		mapa[2][2] = "*";
		//		while(repeticion){
		Scanner sc = new Scanner(System.in);
		String movil = sc.next();
		if(movil.equals("w")){

		}
		//		}
		System.out.println(":" + movil);
	}
*/
}
