package constracter;

public class Sample 
{
	int id;
	String str;
	Sample(int rol,String name)
	{
		id=rol;
		str=name;
	}
	void display() {
		System.out.println(id+" "+str);
	}
	public static void main(String[] args) {
		Sample s=new Sample(11,"Meera");
		s.display();
	}
}
