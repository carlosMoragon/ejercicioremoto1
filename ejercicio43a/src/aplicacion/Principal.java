package aplicacion;
import dominio.*;
public class Principal{
	public static void main(String[] args){
	/*ArrayList<String> textos = new ArrayList<>();
	//añadir elementos con add
	textos.add("Hola");
	textos.add("Adios");
	//para print tenemos que añadirle un get
	System.out.println(textos.get(0));
	int i = 0;
	while(i < textos.size()){
		System.out.println(textos.get(i));
		i++;
	}
	}*/
	Asignatura mates = new Asignatura();
	mates.setNombre("mates");
	Asignatura pr1 = new Asignatura();
	pr1.setNombre("Programacion 1");

	Curso primero = new Curso();
	primero.setNombre("Primero");
	primero.addAsignatura(mates);
	primero.addAsignatura(pr1);
	System.out.println(primero);

}
}
