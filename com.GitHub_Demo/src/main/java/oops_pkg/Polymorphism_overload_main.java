package oops_pkg;

public class Polymorphism_overload_main extends Polymorphism_overloadB
{
	public static void main(String[] args) 
	{
	
//		Polymorphism_overloadB b=new Polymorphism_overloadB();
//		b.m1();
//		b.m1(10);
//		b.m1(20,0);
//		b.m2();
//		b.m2(40,5);
		
		Polymorphism_overload_main m=new Polymorphism_overload_main();
		m.m1();
		m.m1(20);
		m.m1(10, 20);
		m.m2();
		m.m2(30, 40);
		m.m2(10, 20, 30);
		
		
	}
}
