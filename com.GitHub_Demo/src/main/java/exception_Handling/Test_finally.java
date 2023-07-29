package exception_Handling;

public class Test_finally 
{
	public static void main(String[] args)
	{
		try
		{
			int i=25/5;

		}
		catch(Exception e)// won't be excuted 
		{
			System.out.println(e);
		}
		
		// always excute the fianlly excpetion occured or not
		finally
		{
			System.out.println("Excute the always");
		}
	}
}
