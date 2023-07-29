package strings_pkg;

import java.util.Scanner;

public class Duplicate_String 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Charecters");
		String str="";
		int count = 0;
		str=sc.nextLine();
		char[]ch=str.toCharArray();
		for(int i=0;i<str.length();i++) 
		{
			for(int j=i+1;j<str.length();j++) 
			{
				if(ch[i]==ch[j]) 
				{
					count++;
					System.out.println(ch[i]+" "+count);
				}
			}
			//System.out.println(count);
		}
		sc.close();
	}
}
