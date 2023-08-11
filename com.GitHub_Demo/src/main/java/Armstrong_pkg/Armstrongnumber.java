package Armstrong_pkg;

public class Armstrongnumber 
{
	public static void main(String[] args) {
				
		int n = 153;
		int tema = n;
		int a = 0;

		// Function to calculate the sum of
		// individual digits
		while (n > 0) {
			int rem = n % 10;
			a = a + (rem * rem * rem);
			n = n / 10;
		}

		// Condition to check whether the value
		// of a equals to user inaut or not.
		if (tema == a) {
			System.out.println("Armstrongnumber");
		}
		else {
			System.out.println("Not a Armstrongnumber");
		}

	}

}
