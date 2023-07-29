package control_statment;

import java.util.Scanner;

public class Lessthan_pro 
{
	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b= sc.nextInt();
		if(a>b)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		//System.out.println("Over The Program");
		sc.close();
	}
}
