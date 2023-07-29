package strings_pkg;

public class ASIQUE_count
{
	public static void main(String[] args) {
		String str="a b c";//ASIQUE VALUES COUNT
		int count=0;
		char[]ch=str.toCharArray();
		for(int i=0; i<str.length();i++) 
		{
			count=count+ch[i];
			System.out.println(count);
			
		}
		//System.out.println(count);
	}
}
