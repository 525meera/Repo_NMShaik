package github_pkg4;

public class BiggestNumber 
{
	public static void main(String[] args) {
		
		int n1=10;
		int n2=30;
		int n3=20;
		
		if((n1>n2) && (n1>n3)) 
		{
			System.out.println("This biggest value is n1");
		}
		else if((n2>n1) && (n2>n3)) 
		{
			System.out.println("This biggest value is n2");
		}
		else if((n3>n1) && (n3>n2)) 
		{
			System.out.println("This biggest value is n3");
		}
		else
		{
			System.out.println("All are Equles");
		}
		}
}
