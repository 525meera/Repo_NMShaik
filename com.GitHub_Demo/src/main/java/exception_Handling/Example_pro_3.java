package exception_Handling;

public class Example_pro_3 
{
	public static void main(String[] args) 
	{
		int i=1;
		try
		{
			i++;
			System.out.println("Try block i= "+i);
		}
		catch(Exception e)
		{
			i++;
			System.out.println(i);
		}
		//Always Excuted the finally block
		finally
		{
			i++;
			System.out.println("Finally block i= "+i);
		}
	}
}
