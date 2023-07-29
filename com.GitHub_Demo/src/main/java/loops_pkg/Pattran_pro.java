package loops_pkg;

public class Pattran_pro
{

	public static void main(String[] args) {
		int row=5;
		for(int i=row;i>=1;i--) {
			for(int j=i;j<row;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*int r=5;
		for(int i=1;i<=r;i++) 
		{
			for(int j=r;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	}
}

