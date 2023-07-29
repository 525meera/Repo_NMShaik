package gitHub_pkg2;

import java.util.Scanner;

public class Largest_Numbers 
{
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1");
		n1=sc.nextInt();
		System.out.println("Enter n2");
		n2=sc.nextInt();
		if(n1>n2) {
			System.out.println("Lessthan value is True");
		}
		else
		{
			System.out.println("Greaterthan value is False");
		}
		sc.close();
		
	}
}
