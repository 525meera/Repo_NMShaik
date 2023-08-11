package arrayString_pkg;

public class String_WordByWord 
{
	public static void main(String[] args) 
	{
		String str="Shaik Nagul Meera";
		char ch[]=str.toCharArray();
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
			//System.out.println(count);
			String s[]=new String[count];
			String temp="";
			int index=0;
			for(int j=0;j<str.length();j++)
			{
				if(ch[j]==' ')
				{
					//System.out.println(ch[j]);
					
					index++;
					temp="";
				}
				else
				{
					temp=temp+ch[i];
					s[index]=temp;
				}
				//System.out.print(s[index]);
				for(int k=s.length-1;k>=0;i--)
				{
					System.out.println(s[k]);
				}
			}
		}

	}
}
