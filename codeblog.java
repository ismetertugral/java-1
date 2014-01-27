
public class kodbloglama {
	public static void main(String[] args)
	{
		int x;
		x=10;
		
		if(x==10)
		{
			int y=20;
			System.out.println("x and y are :"+x+" "+y);
			x=y*2;
			
		}
		//y=100;//hata verecektir çünkü y ye erişim burdan mümkün değildir. sarmalanmıştır.
		//x' e erişim ise burdan mevcuttur. Sarmalama yapısının önemi burdan anlaşılabilir.
		
		System.out.println("x is "+x);
	}

}

