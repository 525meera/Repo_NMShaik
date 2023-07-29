package gitHub_pkg2;

import java.util.Scanner;

public class Greaterthanpro 
{
	public static void main(String[] args) {
		int a , b;

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		if(a<b)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

		sc.close();
	}	

}
