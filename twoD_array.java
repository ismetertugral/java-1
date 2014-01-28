package cokboyutludizi;

public class cokboyutludiziler {
	
	/*Example two-dimensional arrays
	 * iki boyutlu dizilere örnek olarak verilmiştir.
	 */
	
	public static void main(String args[])
	{
		int twoD[][]=new int[3][4];
		/*4 yapılmıştır sebebi aşağıdaki yazdırılacak kısmın belirlendiği 
		yerin anlaşılması içindir.*/
		int i,j,k=0;
		//Atama işlemi ile dizi elemanlarının yerleştirildiği yerdir.
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				{
					twoD[i][j]=k;
					k++;
				}
		//Yazdırılacak dizi kısmının belirlendiği yerdir.
		for(i=0;i<3;i++)//Satır sayısı için gerçekleştirilen işlemler içindir.
		{
			for(j=0;j<3;j++)//Sütun sayısyı için gerçekleştirilen işlemler içindir
				System.out.print(twoD[i][j]+" ");
			System.out.println();
				
		}
		}
		
	}

/* Ekran Çıktısı/Screenshot

0 1 2 
3 4 5 
6 7 8 

*/
