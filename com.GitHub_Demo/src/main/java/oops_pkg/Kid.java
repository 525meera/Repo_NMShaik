package oops_pkg;

public class Kid extends Son
{
	void son() {
		System.out.println("Kids Call To Father");
	}
	void kids() {
		System.out.println("Kids game");
	}
	public static void main(String[] args) {
		Kid k=new Kid();
		k.son();
		k.kids();
		
		
	}
}
