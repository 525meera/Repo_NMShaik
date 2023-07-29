package this_keyword;

public class Sample 
{
	static int a=10;
	static int b=20;
	static String str="Meera";

	byte b1=127;
	short s=1000;
	int i=4000;
	long l=3000;
	float f=30;
	double d=400;
	char c='A';
	String str1="ZtoH";

	void m1()
	{
		byte b1;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String str1;

		b1=this.b1;
		s=this.s;
		i=this.i;
		l=this.l;
		f=this.f;
		d=this.d;
		c=this.c;
		str1=this.str1;
		
		long l1= (long) (b1+s+i+l+f+d);//Casttype 
		System.out.println(l1);
		
		double d1=b1+s+i+l+f+d;
		System.out.println(d1);
		
		System.out.println(str1);
		System.out.println(c);
	}
	void m2()
	{
		m1();//Non Static Method
		m3();//Static method
	}
	static void m3()
	{
		int g=a+b;
		System.out.println(str);
		System.out.println(g);
	}


	public static void main(String[] args) 
	{
		Sample ss=new Sample();
		ss.m2();

	}
}