package super_Keyword;

public class Example_Method1 extends Example_Method {
	int i=200;
	String name ="Shaik";
	void super_Method() 
	{
		System.out.println("Child Method = "+name+" "+i);
		super.super_Method();// calling to parent method 
	}

}
