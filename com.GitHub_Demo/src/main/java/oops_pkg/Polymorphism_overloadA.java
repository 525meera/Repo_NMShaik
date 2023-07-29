package oops_pkg;

public class Polymorphism_overloadA 
{
	void m1()
	{
		System.out.println("Method 1");
	}
	void m1(int a)
	{
		System.out.println("Int Value :- "+a);
		
	}
		void m1(int i,int q) {
			System.out.println("Int Value :- "+q);
			System.out.println("Int Value :- "+i);
			
		}
}
