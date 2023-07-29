package operators;

import java.util.Scanner;

public class Scanner_Class 
{
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter value 1");
		int a=scr.nextInt();

		System.out.println("Enter value 2");
		int b=scr.nextInt();
		//i have add a and b declaration value

		int c=a+b;
		System.out.println("addition of a + b = "+c);
		scr.close();



	}
}
