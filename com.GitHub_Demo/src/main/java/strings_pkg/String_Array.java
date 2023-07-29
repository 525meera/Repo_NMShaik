package strings_pkg;

public class String_Array 
{
	public static void main(String[] args) {  
		String[] strArray = { "Ani", "Sam", "Joe" };  
		boolean x = false; //initializing x to false  
		int n = 0; //declaration of index variable  
		String s = "Sam";  // String to be searched  
		// Iteration of the String Array  
		for (int i = 0; i < strArray.length; i++) 
		{  
			if(s.equals(strArray[i])) {  
				n = i;
				x = true;  
			}  
		}  
		if(x) 
		{  
			System.out.println(s +" String is found at index "+n);  
		}
		else  
		{
			System.out.println(s +" String is not found in the array "+n);
		}
	}  
}
