package github_pkg3;

public class Person_pro 
{
	public static void main(String[] args) {
		
		String city="Delhi";
		
		if(city == "Mumbai") {
			System.out.println("City is Mumbai");
		}
		else if(city == "Hyderabad") {
			System.out.println("City is Hyderabad");
		}
		else if (city == "Noida") {
			System.out.println("City is Noida");
		}
		else {
			System.out.println("City is "+city);
		}
	}
}
