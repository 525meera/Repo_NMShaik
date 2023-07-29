package static_pkg;

public class Student 
{
	int rollNo;
	String name;
	static String college="Z to H";
	Student(int i,String s)
	{
		rollNo=i;
		name=s;
	}
	void display()
	{
		System.out.println("rollNo:- " +rollNo+ "\nName:- " +name+  "\nCollegeName:- " +college);
	}
	public static void main(String[] args) 
	{
		Student s1=new Student(1,"Meera");
		Student s2=new Student(2,"Nagul");
		Student s3=new Student(3,"Saleem");
		s1.display();
		s2.display();
		s3.display();
		
		
	}
}
