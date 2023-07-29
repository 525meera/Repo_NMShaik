package exception_Handling;

public class Example_pro_7 
{
	static void method()
	{
		try
		{
			System.out.println("Try Block");
		}
		catch (Exception e) 
		{
			System.out.println("Catch Block");
		}
		finally
		{
			return;
		}
		// It shows Unreachable code error at line 18.After wrote the finally block
		//System.out.println("Any Statements");
	}
	public static void main(String[] args)
	{
		method();
	}

}
