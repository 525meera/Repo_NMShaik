package collection_pkg;

import java.util.ArrayList;

public class ArrayListUsingLoop {

	public static void main(String args[]) {
		//int num;
		// initialize ArrayList  
		ArrayList<Integer> al = new ArrayList<Integer>();
		// add elements to ArrayList object
		al.add(3);
		al.add(17);
		al.add(6);
		al.add(9);
		al.add(7);
		System.out.println("Using Advanced For Loop");   
		// printing ArrayList 
		//        for(int i=0;i<al.size();i++) {
		//        	System.out.println(i);
		//        }
		for (int num : al) {         
			System.out.println(num);   
		}
	}
}