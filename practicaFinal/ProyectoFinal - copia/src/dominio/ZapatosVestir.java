package dominio;

public class ZapatosVestir extends Zapatos{
	private String material;
	private int precioFinal;

 	public ZapatosVestir(String nombre, float talla, String material, int precioInicial){
		super(nombre, talla, precioInicial);
		this.material = material;
	}

	public ZapatosVestir(String nombre){
		super(nombre);
	}
	
	public String getMaterial(){
		return material;
	}

	public void setMaterial(String material){
		this.material = material;
	}
	
	//descuento cuero 30% y caucho 60%
	@Override
	public int getPrecioFinal(){
		if(material.equalsIgnoreCase("cuero")){
			precioFinal = getPrecioInicial() * 30 / 100;
		}else if(material.equalsIgnoreCase("caucho")){
			precioFinal = getPrecioInicial() * 60 / 100;
		}else{
			precioFinal = getPrecioInicial();
		}
		return precioFinal;
	}
	
	@Override
	public String toString(){
		return "Zapatos de Vestir:\nNombre: " + getNombre() + ".\nTalla: " + getTalla() + ".\nMaterial: " + material +
			".\nPrecio Inicial: " + getPrecioInicial() + ".\nPrecio Final: " + getPrecioFinal() + ".";
	}
}
