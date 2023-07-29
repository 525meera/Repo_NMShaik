package super_Keyword;

public class Variable1 extends Variable
{
	int i=2000;
	String name="Meera";
	void display() 
	{
		System.out.println("Child variables ="+i);
		System.out.println("Child variables ="+name);
		System.out.println();
		System.out.println("Parent variables ="+super.i);
		System.out.println("Parent variables ="+super.name);
		
	}
}
