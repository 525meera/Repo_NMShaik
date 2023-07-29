package static_pkg;

public class Test_pro 
{
	static byte b=10;
	static short s=20;
	static long l=300000;
	static String str="Meera";

	int i=30;
	float f=20;
	double d=2000;

	public static void m() 
	{
		System.out.println("Static Byte Values "+b);
		System.out.println("Static Short values "+s);
		System.out.println("Static long values "+l);
		System.out.println("Static String name "+str);
	}
	public void m1()
	{
		System.out.println("Integer values  "+i);
		System.out.println("Float values  "+f);
		System.out.println("Double values  "+d);
	}
	public static void main(String[] args)
	{
		Test_pro.m();
		
		Test_pro t=new Test_pro();
		t.m1();
		
	}
}