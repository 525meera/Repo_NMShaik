package exception_Handling;

public class Example_pro_5 {
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Statement 1");
		}
		catch(Exception e)
		{
			System.out.println("Statement 2");
		}
		
		// try, catch and finally blocks together form one unit. 
		//There should not be any other statements in between try-catch-finally blocks.
		//System.out.println("Statement 3");
		
		//Compile time Error
		finally
		{
			System.out.println("Statement 4");
		}
	}

}
