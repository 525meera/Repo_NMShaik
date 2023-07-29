package exception_Handling;

public class Example_pro_9 
{
	static int m() {
		int i=1;
		try
		{
			i=i/0;
			return i;
		}
		catch(Exception e)
		{
			i=i+1;
			//System.out.println(i);
			return i;
		}
		finally
		{
			i=i+2;
			System.out.println("finally "+i);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(m());
	}
}
