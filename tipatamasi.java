package tipatamasi;

public class tipatamasi {
	public static void main(String[] args)
	{
		byte b;
		int i=257;
		double d=323.142;
		System.out.println("\nconvertion of int to byte");
		b=(byte)i;//256dan büyük olduğu için modülü alınır.
		System.out.println("i and b "+i+" "+b);
		System.out.println("\nconvertion of double to int");
		i=(int)d;//virgüllü kısım atılır.
		System.out.println("d and i "+d+" "+i);
		System.out.println("\ncovertion of double to byte");
		b=(byte)d;//virgüllü kısım atılır modül alınır.
		System.out.println("d and b "+d+" "+b);
		
	}

}


/*Ekran Çıktısı:


convertion of int to byte
i and b 257 1

convertion of double to int
d and i 323.142 323

covertion of double to byte
d and b 323.142 67
*/
