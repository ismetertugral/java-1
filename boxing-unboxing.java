//Bu işlemin yapılma amacı b değişkeninin nesne olmasından dolayı değerinin değiştirme işlemini
//yapmak için uygulanır(boxing).
public class BoxingUnboxing {

	
	public static void main(String[] args) {
	
		int a=5;
		Integer b=new Integer(a);//Boxing
		int y= b.intValue();//Unboxing
		

	}

}
