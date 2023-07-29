package control_statment;

import java.util.Scanner;

public class Divisiable_pro 
{
	public static void main(String[] args) {
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The value");
		num=sc.nextInt();
		if(num%3==0) {
			System.out.println("given Number Divisible");
		}
		else
		{
			System.out.println("Not Divisible");
		}
		sc.close();
	}
}
