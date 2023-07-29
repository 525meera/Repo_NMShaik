package strings_pkg;

public class Space_count 
{
	public static void main(String[] args) 
	{
		String str="The Best World";
		int count=0;
		char[]ch=str.toCharArray();
		for(int i=0;i<str.length();i++) 
		{
			if(ch[i]==' ') 
			{
				count++;
			}
		}
		System.out.println("Given String Space Count is = "+count);
	}
}
