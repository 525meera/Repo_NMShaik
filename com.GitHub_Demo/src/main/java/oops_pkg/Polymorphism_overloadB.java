package oops_pkg;

public class Polymorphism_overloadB extends Polymorphism_overloadA
{
	void m2()
	{
		System.out.println("Method 2");
		
	}
	void m2(int a,int b)
	{
		System.out.println("Int Value :- "+a);
		System.out.println("Int Value :- "+b);
		
	}

		void m2(int q,int w,int e) {
			System.out.println("Int Value :- "+q);
			System.out.println("Int Value :- "+w);
			System.out.println("Int Value :- "+e);
		}
		
			
		
}
