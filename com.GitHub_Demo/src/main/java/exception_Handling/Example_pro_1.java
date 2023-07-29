package exception_Handling;

public class Example_pro_1 
{
	public static void main(String[] args) {
		try 
		{
			int i=100/0;// By throw  Exceptions
			//Occuring to remainning not excute
			System.out.println(i);
			System.out.println("Rest Peace");
		}
		//Handling The Exceptions
		catch(Exception ex) 
		{
			System.out.println(ex);
		}
		System.out.println();

		//======================================
		try 
		{
			int i=100/0;// By throw  Exceptions

		}
		//Handling The Exceptions by using class Name
		catch(Exception ex) 
		{
			System.out.println(ex);
			System.out.println("Rest Peace");
		}
		System.out.println();

		//======================================
		int i=100;
		int j=0;
		int data = 0;

		try 
		{
			data=i/j;// By throw  Exceptions
		}
		//Handling The Exceptions by using class Name
		catch(Exception ex) 
		{
			//System.out.println(ex);

			System.out.println("Given the data us diplayed = "+i/(j+1));
			//System.out.println((i/j+1));//Exception main thread  java.lang.ArithmeticException

		}

		//========================================
		try 
		{
			int k=100/0;// By throw  Exceptions

		}
		//Handling The Exceptions by using class Name
		catch(Exception ex) 
		{
			System.out.println("Error message =   "+ex.getMessage());// To display the msg by catch handdling exception 

		}


	}
}
