package array_pkg;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Element of array");
		int k=arr.length-1;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<size;j++)
		{
			if(arr[j]==arr[k])
			{
				count++;
			}
			k--;
		}
		if(count==size)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		sc.close();
	}

}
