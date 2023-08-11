package arrayString_pkg;

public class Duplicate_Charecter_Remove 
{
	public static void main(String[] args) 
	{
		String str1="SaleemShaik";
		int count;
		char[] ch=str1.toCharArray();
		for(int i=0;i<str1.length();i++) 
		{
			count=0;
			for(int j=i;j<str1.length();j++) 
			{
				if(ch[i]==ch[j])
				{
					count++;
					//System.out.println(ch[i]+" "+count);
					for(int k=i-1;k>=0;k--) 
					{
						//System.out.println(count);
						if(ch[k]==ch[i])
						{
							count--;
						}
					}
				}
			}
			if(count>0)
			{
				System.out.print(ch[i]);	
			}
			//count=0;
		}
	}
}
