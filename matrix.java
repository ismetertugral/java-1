package matrix;

public class matrix {
	public static void main(String args[])
	{
		double matrix[][]={
				{0*0,1*0,2*0,3*0,4*0},
				{0*1,1*1,2*1,3*1,4*1},
				{0*2,1*2,2*2,3*2,4*2},
				{0*3,1*3,2*3,3*3,4*3}
		};
		int i,j;
		
		for(i=0;i<4;i++){
			for(j=0;j<4;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}

}

/*
0.0 0.0 0.0 0.0 
0.0 1.0 2.0 3.0 
0.0 2.0 4.0 6.0 
0.0 3.0 6.0 9.0 


double kullanıldığı için 0.0 şeklinde sonuç çıkmıştır.
Screenshot has two numbers because, I was used double type of parameter.



*/
