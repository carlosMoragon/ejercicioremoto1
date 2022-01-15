package dominio;

import java.util.ArrayList;

public class Registro{
	private ArrayList<Zapatos> zapatos = new ArrayList<>();

	public ArrayList<Zapatos> getZapatos(){
		return zapatos;
	}

	public void setZapatos(ArrayList<Zapatos> zapatos){
		this.zapatos = zapatos;
	}

	public addZapato(Zapatos zapato){
		zapatos.add(zapato);
	}
}
