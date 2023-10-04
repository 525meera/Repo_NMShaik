package arrayString_pkg;

import java.util.Scanner;

public class checkSubString 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str1=sc.nextLine();
		char ch[]=str1.toCharArray();
		System.out.println("Enter subString");
		String str2=sc.next();
		char ch1[]=str2.toCharArray();
		int count = 0;
		for(int i=0;i<ch1.length;i++)
		{ 
			if(ch[i]==ch1[i])
			{
				count++;
			}
		}
		if(count==ch1.length)
		{
			System.out.println("It is SubString");
		}
		else
		{
			System.out.println("It is not a SubString");
		}
		sc.close();
	}
}
