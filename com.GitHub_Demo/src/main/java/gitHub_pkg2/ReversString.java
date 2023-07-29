package gitHub_pkg2;

public class ReversString 
{
	public static void main(String[] args) {
		String str= "Naman";
		String rev="";
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}
