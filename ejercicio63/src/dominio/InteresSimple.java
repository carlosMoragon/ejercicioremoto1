package dominio;

import java.math.BigDecimal;

public class InteresSimple{
	
	public String getInteresSimple(String capital1, String redito1, String tiempo1){
		BigDecimal capital = new BigDecimal(capital1);
		BigDecimal redito = new BigDecimal(redito1);
		BigDecimal tiempo = new BigDecimal(tiempo1);
		BigDecimal interesSimple = capital.multiply(redito).multiply(tiempo);
		return "El interes simple es: " + interesSimple + 
			"\nLos datos introducidos son:\n" +
			"Capital: " + capital +
			"\nRedito: " + redito +
			"\nTiempo: " + tiempo;
	}
}
