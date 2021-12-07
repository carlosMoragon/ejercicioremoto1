package dominio;

public class Concesionario{

	VehiculoTurismo audi = new VehiculoTurismo("audi", "a1", 21.900);
	VehiculoTurismo seat = new VehiculoTurismo("seat", "ibiza", 16.520);
	VehiculoTurismo suzuki = new VehiculoTurismo("suzuki", "across", 53.700);
	
	audi.precioFinal(5);
	seat.precioFinal(4);
	suzuki.precioFinal(7);
}
