//Fonksiyon yazımı

public class degerdegistirme {//Class bilgilerini içerir.

	
	public static void main(String[] args)//temel main fonksiyonumuzdur.
	{
		Deneme d= new Deneme();//Sınıftan nesne yaratan operatör (nesne yaratıcı) 
		d.x=50;//carp fonksiyonu ile bağlantıyı sağlar
		System.out.println("Sayinin ilk degeri:"+d.x);//ilk değeri ekrana yazar
		carp(d);//carpma islemini gerçekleştirir.
		System.out.println("Sayinin ikinci degeri:"+d.x);//ikinci değeri ekrana yazar.
		
	}
	public static void carp(Deneme d)//deneme nesnesi ile bağlanıtı sağlayan fonksiyondur. Carpma işlemini gerçekleştirir.
	{
		d.x=d.x*2;//istenilen işlemin yapıldığı kısımdır.
	}
}

class Deneme	//deneme classının içindeki değişkenlerin belirtildiği yerdir.
{
	public int x;		//int tipindeki değişkenimizdir.public olmasının sebebi tüm fonksiyonlarda kullanılabilir olmasıdır.
}
