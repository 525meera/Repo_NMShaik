package arrayString_pkg;

import java.util.Scanner;

public class Space_Remove 
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Charecters");
		String str=sc.nextLine();
		char arr [] = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				System.out.print(arr[i]);

			}

		}
		sc.close();
	}
}
