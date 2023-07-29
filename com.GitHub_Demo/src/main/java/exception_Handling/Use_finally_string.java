package exception_Handling;

public class Use_finally_string
{
	public static void main(String[] args) 
	{
		try 
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			System.out.println("String get a message = "+ex.getMessage());
		}
		finally
		{
			System.out.println("Always Excute the finally block");
		}
	}
}
