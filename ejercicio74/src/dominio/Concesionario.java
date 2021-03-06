package dominio;

import java.util.ArrayList;

public class Concesionario{
	ArrayList<VehiculoTurismo> catalogo = new ArrayList<>();
	public void addVehiculo(VehiculoTurismo vehiculo){
		catalogo.add(vehiculo);
	}

	public int calcularPrecioTotal(){
		int precioTotal = 0;
		for(VehiculoTurismo vehiculo: catalogo){
			precioTotal += vehiculo.precioFinal();
		}
		return precioTotal;
	}

	public String toString(){
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("El precio total de los vehiculos es: " + calcularPrecioTotal()+"\n");
		for(VehiculoTurismo vehiculo: catalogo){
			mensaje.append(vehiculo + "\n");
		}
		return mensaje.toString();
	}
}
