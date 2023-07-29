package loops_pkg;

public class Sample5 
{
	public static void main(String[] args) {
		int row=5;
		for(int i=row;i>=1;i--) {

			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
