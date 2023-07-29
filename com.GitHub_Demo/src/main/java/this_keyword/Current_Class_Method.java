package this_keyword;

public class Current_Class_Method 
{
	void method()
	{
		System.out.println("Method");
	}
	void display()
	{
		this.method();//Called to current class method by using the this keyword
		System.out.println("METHOD");
	}
	public static void main(String[] args) 
	{
		Current_Class_Method cm=new Current_Class_Method();
		cm.display();
	}
}
