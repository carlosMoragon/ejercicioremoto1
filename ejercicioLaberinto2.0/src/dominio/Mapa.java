package dominio;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Mapa{
	try{
	File mapa = new File("lab10.txt");
	Scanner sc = new Scanner(mapa);
	} catch(FileNotFoundException e){
		System.out.println(e);
	}

	public String procesarMapa(){
	String mapaProcesado = "";
	while(sc.hasNext()){
		mapaProcesado += sc.nextLine() + "\n";
	}
	return mapaProcesado;
	}
}
