package aplicacion;
import dominio.*;
public class Principal{
	public static void main(String[] args){
		Concesionario concesionario = new Concesionario();
		VehiculoTurismo audi = new VehiculoTurismo("audi", "a1", 20000, 7);
		VehiculoTurismo mercedes = new VehiculoTurismo("mercedes", "Clase A", 50, 5);
		Furgoneta furgoneta = new Furgoneta("Fiat","Ducato",20000, 8);
		//auque añadimos un vehiculoTurismo a un arrayList de vehiculos, como todos los vehiculosturismos son vehiculos no hay problema.
		concesionario.addVehiculo(audi);
		concesionario.addVehiculo(mercedes);
		concesionario.addVehiculo(furgoneta);
		System.out.println(concesionario);
		//polimorfismo es que un objeto se pueda comportar como, por ejemplo vehiculo y como vehiculoTurismo.

	}
}
