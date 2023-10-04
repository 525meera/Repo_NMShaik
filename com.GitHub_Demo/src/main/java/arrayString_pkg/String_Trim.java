package arrayString_pkg;

import java.util.Scanner;

public class String_Trim 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();
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
					s2=c2[j]+s2;
				}
				break;
			}
		}
		System.out.println(s2);
		sc.close();
	}
}
