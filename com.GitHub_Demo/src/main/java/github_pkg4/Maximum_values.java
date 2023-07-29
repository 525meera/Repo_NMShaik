package github_pkg4;

import java.util.Scanner;

public class Maximum_values 
{
	public static void main(String[] args) {
		int num1;
		int num2;
		int largest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		num1=sc.nextInt();
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		if(num1>num2) {
			largest=num1;
			System.out.println("Largest Number Among to = "+largest);
		}
		else {
			largest=num2;
			System.out.println("Not Largest Number Among to = "+largest);
		}
		sc.close();
	}

}
