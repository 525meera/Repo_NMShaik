package control_statment;

import java.util.Scanner;

public class Even_Odd_pro
{
	public static void main(String[] args) {
		/*int even=10;
		int odd=13;
		if(even%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd");
		}*/
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Even Number "+num);
		}
		else {
			System.out.println("Odd Number "+num);
		}
		sc.close();
	}

}
