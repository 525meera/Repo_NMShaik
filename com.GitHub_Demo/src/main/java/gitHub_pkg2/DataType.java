package gitHub_pkg2;

public class DataType 
{
	public static void main(String[] args) {
		byte a;
		a= 127;
		System.out.println("byte value : "+a);
		short s= -32768;
		System.out.println("short value"+s);
		int i= 2147483647;
		System.out.println("integer value: "+i);
		long l=9222036854775807l;
		System.out.println("long value "+l);
		char c= 'a';
		System.out.println("char:- "+c);

		String ss= "Meera";
		System.out.println("my name is "+ss);

		float f=2.12345678F;
		System.out.println("float value : "+f);
		double d=123.12345678345678345678234567;
		System.out.println("Double value : "+d);
		System.out.println();
		boolean n=true;
		boolean m=false;
		int w=10;
		int r=20;

		if(w>r) {// correct 
			System.out.println("Boolean: "+n);
		}
		else {// wrong
			System.out.println("Boolean: "+m);
		}
	}
}
