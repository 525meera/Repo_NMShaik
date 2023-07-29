package this_keyword;

public class Student_pro 
{
	//Current class instance variable

	int rollno;
	String name;
	double fee;

	Student_pro(int rollno,String name,double fee) 
	{

		//		rollno=rollno;
		//		name=name;  //don't have use this keyword
		//		fee=fee;

		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
	public static void main(String[] args) 
	{
		Student_pro s=new Student_pro(1,"Shaik", 2000);
		s.display();
	}
}
