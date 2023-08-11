package arrayString_pkg;


public class Wordtoword {
	public static void reversTheStringWordByWord(String str1,char myChar)
	{
		//String str="Shaik Nagul Meera ";
		String str=str1;
		char nh[]=str.toCharArray();
		int count=0;
	//	System.out.println(str+"*");
		//========================================
		if(nh[nh.length-1]!=' ')
		{
			str=str+" ";
		}
		//========================================
		//System.out.println(str+"*");
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
		}
		System.out.println(count);
		String s[]=new String[count];
		String finalArray[]=new String[count];
		String temp="";
		int index=0;
		for(int i=0;i<ch.length;i++)
		{

			if(ch[i]==' ')
			{
				s[index]=temp;
				temp="";
				index++;
			}
			else
			{
				temp=temp+ch[i];
				//System.out.println(temp);
			
			}

		}

		//System.out.println(count);
		//System.out.print(s[0]+" ");
		for(int k=s.length-1;k>=0;k--)
		{
			finalArray[s.length-1-k]=s[k];
			//System.out.print(s[k]+" ");

		}
		//System.out.print(s[0]+" ");
		for(int l=0;l<s.length;l++)
		{
			System.out.print(finalArray[l]+" ");
		}
	}

	public static void main(String[] args) 
	{
		reversTheStringWordByWord("Shaik Nagul Meera ",' ');
		System.out.println();
		System.out.println("**********************");
		String str="Shaik Nagul Meera ";
		char nh[]=str.toCharArray();
		int count=0;
	//	System.out.println(str+"*");
		//========================================
		if(nh[nh.length-1]!=' ')
		{
			str=str+" ";
		}
		//========================================
		//System.out.println(str+"*");
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
		}
		System.out.println(count);
		String s[]=new String[count];
		String finalArray[]=new String[count];
		String temp="";
		int index=0;
		for(int i=0;i<ch.length;i++)
		{

			if(ch[i]==' ')
			{
				s[index]=temp;
				temp="";
				index++;
			}
			else
			{
				temp=temp+ch[i];
				//System.out.println(temp);
			
			}

		}

		//System.out.println(count);
		//System.out.print(s[0]+" ");
		for(int k=s.length-1;k>=0;k--)
		{
			finalArray[s.length-1-k]=s[k];
			//System.out.print(s[k]+" ");

		}
		//System.out.print(s[0]+" ");
		for(int l=0;l<s.length;l++)
		{
			System.out.print(finalArray[l]+" ");
		}
	}
}



