package dominio;

import java.util.ArrayList;

public class Concesionario{
	//Al ser el catalogo de tipo vehiculo (la clase general) solo vamos a tener un catalogo que es lo que queremos.
	ArrayList<Vehiculo> catalogo = new ArrayList<>();

	public void addVehiculo(Vehiculo vehiculo){
		catalogo.add(vehiculo);
	}

	public int calcularPrecioTotal(){
		int precioTotal = 0;
		for(Vehiculo vehiculo: catalogo){
			//vehiculo.precioFinal() invoca al metodo de precioFinal() de la clase que sea el objeto, es decir, Furgoneta, VehiculoTurismo, etc.
			precioTotal += vehiculo.precioFinal();
		}
		return precioTotal;
	}

	public String toString(){
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("El precio total de los vehiculos es: " + calcularPrecioTotal()+"\n");
		for(Vehiculo vehiculo: catalogo){
			mensaje.append(vehiculo + "\n");
		}
		return mensaje.toString();
	}
}
