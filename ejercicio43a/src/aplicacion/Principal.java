package aplicacion;
import java.util.ArrayList;

public class Principal{
	public static void main(String[] args){
	ArrayList<String> textos = new ArrayList<>();
	//añadir elementos con add
	textos.add("Hola");
	textos.add("Adios");
	//para print tenemos qu eañadirle un get
	System.out.println(textos.get(0));
	int i = 0;
	while(i < textos.size()){
		System.out.println(textos.get(i));
		i++;
	}
	}
}
