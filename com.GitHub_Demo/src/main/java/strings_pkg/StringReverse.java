package strings_pkg;

import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		char []arr=str.toCharArray();
		char temp;
		for(int i=0;i<str.length()/2;i++)	
		{
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;

		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]);
		}
		sc.close();

	}
}
