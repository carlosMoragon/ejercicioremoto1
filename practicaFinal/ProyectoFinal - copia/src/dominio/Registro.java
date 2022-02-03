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

	public void addZapato(Zapatos zapato){
		zapatos.add(zapato);
	}
	
	public void deleteZapato(Zapatos zapato){
		zapatos.remove(zapato);
	}

	public String toCSV(){
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("tipo, nombre, talla, color/material, precio inicial, precio final");
		for(Zapatos zapato: zapatos){
			mensaje.append(zapato + "\n");
		}
		return mensaje.toString();
	}

	public String toString(){
		StringBuilder mensaje = new StringBuilder();
		if(zapatos.size() != 0){	
			for(Zapatos zapato: zapatos){
				mensaje.append(zapato + "\n");
			}
		}else{
			mensaje.append("No tienes ningún zapato en el registro");
		}
		return "Tienes estos zapatos en el registro:\n" + mensaje.toString();
	}
}
