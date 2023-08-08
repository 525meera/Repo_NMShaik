package gitHub_pkg1;

import java.util.Scanner;

public class AreaofCircle
{
	public static void main(String[] args) {
		int r;
		double pi=3.14;
		double area;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		r=sc.nextInt();
		area=pi*r*r;
		System.out.println("Area OF Circle "+area);
		sc.close();

	}
}
