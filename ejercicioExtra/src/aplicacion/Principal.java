package aplicacion;
public class Principal{
	public static void main(String[] args){
		int[] a = new int[3];
		a[0] = 5;
		a[1] = 2;
		a[2] = 8;
		int[] b = a;
		b[1] = 4;
		for(int i = 0; i <= 2; i++)
		{
			System.out.println(a[i]);
		}
	}
}
