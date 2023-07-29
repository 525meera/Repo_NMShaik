package oops_pkg;

public class Inhiritance_Multiple_ClassC extends Inhiritance_Multiple_ClassB{
	void m5() 
	{
		System.out.println("M5 Method");
	}
	void m6() 
	{
		System.out.println("M6 Method");
	}
	public static void main(String[] args) {
		Inhiritance_Multiple_ClassC c=new Inhiritance_Multiple_ClassC();
		c.a=20;
		System.out.println("ClassA values : "+c.a);
		c.b=60;
		System.out.println("ClassA values : "+c.b);
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m5();
		c.m6();

	}
}
