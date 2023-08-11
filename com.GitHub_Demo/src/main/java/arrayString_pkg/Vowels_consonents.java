package arrayString_pkg;

import java.util.Scanner;

public class Vowels_consonents 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string charecter");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int vowels = 0,consonents=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				vowels= vowels++;
				System.out.println("Vowels   =   "+ch[i]);
			}
		}
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]!='a'&& ch[i]!='e'&& ch[i]!='i'&& ch[i]!='o'&& ch[i]!='u')
			{
				consonents= consonents++;
				System.out.println("consonents   =   "+ch[i]);
			}
		}
		sc.close();
	}
}
