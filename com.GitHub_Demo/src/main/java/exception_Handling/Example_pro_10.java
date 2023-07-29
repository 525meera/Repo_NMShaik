package exception_Handling;

public class Example_pro_10 
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
		}

		
		/*
		  try 
		  { 
		  String s="abc"; int i=s.length(); 
		  }
		   catch(Exception ex) 
		   {
		 System.out.println(ex); 
	}
		 */
	}

}
