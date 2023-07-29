package exception_Handling;

public class Example_pro_2 
{
	public static void main(String[] args) {
		try {
			System.out.println("Statment 1");
			System.out.println("try block");
			System.out.println("Statment 2");
		}
		catch(Exception e) {
			System.out.println("Statment 3");
			System.out.println("Catch block");
			System.out.println("Statment 4");
		}
	}
}
