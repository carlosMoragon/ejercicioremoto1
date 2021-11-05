package aplicacion;
public class Principal{
	//String[] es un array de tipo String
	public static void main(String[] args){
		//System.out.println(args[0]);
		try{
			for(int i = 0; i < args.length; i++){
			System.out.print(args[i]);

			}
		}catch(Exception e){
			System.out.println("No tienes ningún elemento en tu array");
		}
	}
}
