package dominio;

import java.util.ArrayList;

public class Concesionario{
	ArrayList<VehiculoTurismo> catalogo = new ArrayList<>();
	public void addVehiculo(VehiculoTurismo vehiculo){
		catalogo.add(vehiculo);
	}
	public String toString(){
		StringBuilder mensaje = new StringBuilder();
		for(VehiculoTurismo vehiculo: catalogo){
			mensaje.append(vehiculo + "\n");
		}
		return mensaje.toString();
	}
}
