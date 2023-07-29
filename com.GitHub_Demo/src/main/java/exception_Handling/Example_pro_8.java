package exception_Handling;

public class Example_pro_8 
{
	static int m()
	{
		int i=1;
		try 
		{
			i=i+1;
			return i;//To display the try return value
		}
		catch(Exception e)
		{
			i=i+2;
		}
		finally
		{
			i=i+3;
		}
		return i;
	}
	public static void main(String[] args) {
		System.out.println(m());
	}
}
