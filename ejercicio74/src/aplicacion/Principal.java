package aplicacion;
import dominio.*;
public class Principal{
	public static void main(String[] args){
		Concesionario concesionario = new Concesionario();
		VehiculoTurismo audi = new VehiculoTurismo("audi", "a1", 20000, 7);
		VehiculoTurismo mercedes = new VehiculoTurismo("mercedes", "Clase A", 50, 5);
		concesionario.addVehiculo(audi);
		concesionario.addVehiculo(mercedes);
		System.out.println(concesionario);

	}
}
