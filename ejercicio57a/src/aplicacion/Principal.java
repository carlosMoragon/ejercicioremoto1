package aplicacion;
import dominio.*;
import java.util.ArrayList;
public class Principal{
	public static void main(String[] args){
		/*
		//hemos creado un ArrayList de clase Integer por que no se puede de clase int
		ArrayList<Integer> coleccionNumeros = new ArrayList<>();
		coleccionNumeros.add(123);
		coleccionNumeros.add(12);
		coleccionNumeros.add(1);
		coleccionNumeros.add(12);
		System.out.println(coleccionNumeros);
		
		//remove quita el primero si hay 2 numeros iguales
		//coleccionNumeros.remove(coleccionNumeros.indexOf(12));
		//coleccionNumeros.remove(new Integer(12)); --> te sale "deprecated" = a q no se deberia usar pero por cuestion historica debe existiendo
		//coleccionNumeros.remove((Integer) 12);

		coleccionNumeros.remove(Integer.valueOf(12));
		System.out.println(coleccionNumeros);
		*/
		/*
		//el metodo removeAll() para eliminar una coleccion

		ArrayList<Asignatura> asignaturas = new ArrayList<>();
		asignaturas.add(new Asignatura("Progra"));

		Asignatura mates = new Asignatura("Mates");
		asignaturas.add(mates);

		//asignaturas.add(new Asignatura("Mates"));

		asignaturas.add(new Asignatura("Fisica"));
		asignaturas.add(new Asignatura("Fot"));
		asignaturas.add(new Asignatura("INI"));
		System.out.println(asignaturas);

		asignaturas.remove(mates);
		System.out.println(asignaturas);
		*/
		/*
		Asignatura a1 = new Asignaruta("A");
		Asignatura a2 = new Asignatura("A");
		System.out.println(a1 == a2);
		//Imprime un booleano de valor false dado que compara objeto que no estan apuntando a la misma direccion de memoria
		*/
		ArrayList<Asignatura> asignaturas = new ArrayList<>();
		int id = 0;
 		asignaturas.add(new Asignatura(id++, "Progra", 1, 50));
                Asignatura mates = new Asignatura(id++, "Mates", 1, 45);
		asignaturas.add(new Asignatura(id++, "Fisica", 1, 40));
                asignaturas.add(new Asignatura(id++, "Fot", 1, 35));
                asignaturas.add(new Asignatura(id++, "INI", 1, 30));
                System.out.println(asignaturas);

		asignaturas.add(new Asignatura(1, "Mates", 1, 45));

		Asignatura asignatura = new Asignatura(20, "Fisica", 1, 99);
		String ejemplo = "String de ejemplo";
		System.out.println(ejemplo.equals(asignatura));
		System.out.println(asignatura.equals(ejemplo));

	}
}
