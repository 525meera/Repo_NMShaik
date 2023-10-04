package arrayString_pkg;

public class String_word_Reverse
{
	public static void main(String[] args) {
		
		String s="Hi Hello Hi ";
		char c1[]=s.toCharArray();
		String s1="";
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=' ')
			{
				for(int j=i;j<c1.length;j++)
				{
					s1=s1+c1[j];
				}
				break;
			}
		}
		char c2[]=s1.toCharArray();
		String s2="";
		for(int i=c2.length-1;i>=0;i--)	
		{
			if(c2[i]!=' ')
			{
				for(int j=i;j>=0;j--)
				{
					s2=s2+c2[j];
				}
				break;
			}
		}
		System.out.println(s2);
	}
}