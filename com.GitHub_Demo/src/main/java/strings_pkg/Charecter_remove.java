package strings_pkg;

public class Charecter_remove 
{
	public static void main(String[] args) 
	{
		/*String str = " ";
		String num=" ";
		char ch;
		System.out.println("Enter The a letter to replace");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		//ch=str.charAt(0);
		System.out.println("Enter The string letters");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) 
			{
				num=num+'*';
			}
			else {
				num=num+str.charAt(i);
			}
		}
		System.out.println("String after remove   " +str+"   is   "+num);
		sc.close();*/

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
