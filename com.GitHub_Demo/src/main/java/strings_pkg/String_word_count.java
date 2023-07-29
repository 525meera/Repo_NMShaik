package strings_pkg;

public class String_word_count 
{
	public static void main(String[] args) 
	{
		String str="The Best World";
		int count=1;
		int length=str.length();
		char [] ch=str.toCharArray();
		//System.out.println(ch);
		for(int i=0;i<length;i++)
		{
			if(ch[i]==' ')
			{
				if(!(i==0||i==ch.length-1))
				{
					count++;
				}
				if(i!=(ch.length-1))
				{
					if(ch[i+1]==' ')
					{
						count--;
					}
				}
			}
		}
		System.out.println(count);
		
	}
}
