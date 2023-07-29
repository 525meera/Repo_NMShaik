package static_pkg;

public class Test_pro1 
{
	 static int m() 
	{
		int id = 1;
		String name = "Meera";
		int empId = 1234;
		String address = "ATp";
		String city = "Hyd";
		System.out.println(id);
		System.out.println(name);
		System.out.println(empId);
		System.out.println(address);
		System.out.println(city);
		System.out.println();
		return id;
	}
	static void m2(int id,String name,int empId,String address,String city)
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(empId);
		System.out.println(address);
		System.out.println(city);
	}
	public static void main(String[] args) 
	{
		Test_pro1.m();
		Test_pro1.m2(2, "Saleem", 1234567, "Hyderaguda", "Hyd");
	}
}
