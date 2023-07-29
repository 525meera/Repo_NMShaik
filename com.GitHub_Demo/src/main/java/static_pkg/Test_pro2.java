package static_pkg;

public class Test_pro2 
{
	// non-static method
	int multiply(int a, int b)
	{
		return a * b;
	}

	// static method
	static int add(int a, int b)
	{
		return a + b;
	}
	public static void main( String[] args ) 
	{
		// create an instance of the StaticTest class
		Test_pro2 st = new Test_pro2();

		// call the nonstatic method
		System.out.println(" 2 * 2 = " + st.multiply(2,2));

		// call the static method
		System.out.println(" 2 + 3 = " + Test_pro2.add(2,3));
	}
}