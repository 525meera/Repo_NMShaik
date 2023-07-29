package this_keyword;

public class Example 
{
	int a=10;
	int b=20;
	int c;
	String str="HYD";
	void m1(int a,int b,String str)
	{
		a=this.a;
		b=this.b;
		str=this.str;
		c=a+b;
		System.out.println("Addition of a+b = "+c);// To display to global variables values
	}
	static	void m2(int a,int b)
	{
		//      this.a; // non-static context this keyword not use in static methods // compile time error
		//		this.b;
		//		this.c=a+b;
	}

	void m3(int a,int b)
	{
		this.a=a;
		this.b=b;
		this.c=a+b;
		System.out.println("Addition of a+b = "+c);//To display to inside method parameter variables values
	}
	
	public static void main(String[] args) 
	{
		Example ee=new Example();
		ee.m1(12,11,"Meera");
		ee.m3(12,12);
	}


}
