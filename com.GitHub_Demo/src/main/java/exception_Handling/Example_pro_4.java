package exception_Handling;

public class Example_pro_4{
	public static void main(String[] args) {
		try
		{
			int[] a = {1, 2, 3, 4};
			int i = a[4];
		}
		catch (NumberFormatException e) 
		{
			System.out.println("Statement 1");
		}
		catch (NullPointerException e) 
		{
			System.out.println("Statement 2");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
			System.out.println("Statement 3");

		}
	}

}
