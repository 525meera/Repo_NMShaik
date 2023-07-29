package operators;

public class Logical {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		boolean d= (a<b) && (c>a);//true
		boolean d1= (a>b) && (c>a);//false
		
		System.out.println(d);
		System.out.println(d1);
		System.out.println();
		
		boolean d2= (a<b) || (c>a);//true
		boolean d3= (a>b) || (c>a);//true

		System.out.println(d2);//true 
		System.out.println(d3);//true 


		
		//System.out.println((a>b)&&(b>c));//False
		
		//System.out.println((a>b)||(b>c));//False

	}


}
