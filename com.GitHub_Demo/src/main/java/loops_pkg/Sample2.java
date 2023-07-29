package loops_pkg;

public class Sample2 
{
	public static void main(String[] args) {
		int row=5;
		for(int i=1;i<=row;i++) {
			//System.out.println(i);// Is Display to 5 Rows
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}
}
