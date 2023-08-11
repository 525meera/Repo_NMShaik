package strings_pkg;

public class ASCII_count
{
	public static void main(String[] args) {
		String str="abc";//ASCII VALUES COUNT
		int count=0;
		char[]ch=str.toCharArray();
		for(int i=0; i<str.length();i++) 
		{
			//count=count+ch[i];    //adding ASCII values
			count=ch[i];           //actual ASCII values
			System.out.println(count);
			
		}
		//System.out.println(count);
	}
}
