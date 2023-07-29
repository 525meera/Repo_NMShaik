package operators;

public class Assignment_oparetor 
{
	public static void main(String[] args) {
		int a=4;
		int b;
		
		//assign value using
		b = a;
		System.out.println("B value 1 = "+b);//4
		
		//assign value Using
		b += a;
		
		System.out.println("B value 2 = "+b);//8
		
		//assign value Using
		b -= a;
		
		System.out.println("B value 3 = "+b);//4
		
		//assign value Using
		b *= a;
		b= b*a;
		System.out.println("B value 4 = "+b);//16
		
		//assign value using
		b /= a;
		b= b/a;
		System.out.println("B value 5 = "+b);//4
		
		//assign value using
		b %= a;
		
		b=b%a;
		
		System.out.println("B value 6 = "+b);//0
		
		
				
		
		
	}

}
