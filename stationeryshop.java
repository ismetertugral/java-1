//Basic Stationery Shop System with Java
//Version 0.0.1
// if you want to contact me for anything
//oguzhantasci.wordpress.com
//twitter.com/oguzhntasci
//facebook.com/oguzhantasc
//oguzhantasc@gmail.com

import java.util.Scanner;     //kullanılacak paketin tanımlandığı kısımdır. yerdir.we will use package name
public class basicsystem {

	public static void main(String[] args)
	{
		System.out.println("\t\tWelcome Basic Stationery Shop System ");
		
		int pencil,pricepencil;
		int eraser,priceeraser;
		int book,pricebook;
		int select;
		Scanner scan = new Scanner(System.in); 
		int total;
	
		
		do{
		System.out.println("Please enter prices\t\t");
		System.out.print("Pencil Price: ");
		pricepencil=scan.nextInt();
		System.out.print("Eraser Price: ");
		priceeraser=scan.nextInt();
		System.out.print("Book Price: ");
		pricebook=scan.nextInt();
		
		
		
		
		System.out.println("1-Book");
		System.out.println("2-Eraser");
		System.out.println("3-Pencil");
		System.out.println("4-Book+Pencil");
		System.out.println("5-Book+Eraser");
		System.out.println("6-Pencil+Eraser");
		System.out.println("7-All");
		System.out.println("8-Exit");
		System.out.println("Select process");
		select=scan.nextInt(); 
		
		switch(select)
		{
		case 1://book
			{
				System.out.print("Please enter book sum: ");
				book=scan.nextInt();
				total=book*pricebook;
				System.out.println("Total: "+total);
				break;
			}
		case 2://eraser
			{
				System.out.print("Please enter eraser sum: ");
				eraser=scan.nextInt();
				total=eraser*priceeraser;
				System.out.println("Total: "+total);
				break;
			}
		case 3://pencil
			{
				System.out.print("Please enter pencil sum: ");
				pencil=scan.nextInt();
				total=pencil*pricepencil;
				System.out.println("Total: "+total);
				break;
			}
		case 4://book pencil
			{
				System.out.print("Please enter book sum: ");
				book=scan.nextInt();
				System.out.print("Please enter pencil sum: ");
				pencil=scan.nextInt();
				total=(pencil*pricepencil)+(book*pricebook);
				System.out.println("Total: "+total);
				break;
			}
		case 5://book eraser
			{	
				System.out.print("Please enter book sum: ");
				book=scan.nextInt();
				System.out.print("Please enter eraser sum: ");
				eraser=scan.nextInt();
				total=(book*pricebook)+(eraser*priceeraser);
				System.out.println("Total: "+total);		
				break;
			}
		case 6://pencil eraser
			{
				System.out.print("Please enter pencil sum: ");
				pencil=scan.nextInt();
				System.out.print("Please enter eraser sum: ");
				eraser=scan.nextInt();
				total=(pencil*pricepencil)+(eraser*priceeraser);
				System.out.println("Total: "+total);
				break;
			}
		case 7://all
			{
				System.out.print("Please enter pencil sum: ");
				pencil=scan.nextInt();
				System.out.print("Please enter eraser sum: ");
				eraser=scan.nextInt();
				System.out.print("Please enter book sum: ");
				book=scan.nextInt();
				total=(pencil*pricepencil)+(eraser*priceeraser)+(book*pricebook);
				System.out.println("Total: "+total);
				break;
			}
		case 8://exit
			{
				break;
			}
		}
	}while(select<8); //8 den küçük olana kadar devam eder. When select is 8 or more, loop will end.
		System.out.println("Good bye!");
		
		
			
}
	
	
}
