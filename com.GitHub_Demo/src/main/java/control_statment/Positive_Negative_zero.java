package control_statment;

import java.util.Scanner;

public class Positive_Negative_zero 
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		if(num>0) {
			System.out.println("Postive Number");
		}
		else if(num<0) {
			System.out.println("Negative Number");
			
		}
		else {
			System.out.println("Zero Number");
		}
		sc.close();
		
		
	}
}
