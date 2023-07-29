package github_pkg3;

public class Static_variables 
{
	int a;//Without Static variable
	int b;
	static int c=10;//With Static variable
	static byte d=20;
	static void add() //Static method
	{
		int e=c+d;
		System.out.println("Addition "+e);

	}
	static void sub() 
	{
		int e=c-d;
		System.out.println("Subsraction "+e);
	}
	static void mul() 
	{
		int e=c*d;
		System.out.println("Multiplication "+e);
		System.out.println();
	}

	void add1() 
	{
		int e=c+d;
		System.out.println("Addition "+e);

	}
	void sub1() 
	{
		int e=c-d;
		System.out.println("Subsraction "+e);

	}
	public static void main(String[] args) 
	{
		Static_variables st=new Static_variables();
		st.a=30;
		st.b=40;


		st.add(); //static methods to calling to object reference variable
		st.sub();
		st.mul();



		

		st.add1();//without static method
		st.sub1();

		Static_variables.add();
		Static_variables.sub();
		Static_variables.mul();
		//Static_Variable.add1();//without static variable is not executing and then compile time error
		//Static_Variable.sub1();
	}

}

