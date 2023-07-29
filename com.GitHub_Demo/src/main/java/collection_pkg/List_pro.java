package collection_pkg;

import java.util.ArrayList;
import java.util.List;

public class List_pro 
{
	public static void main(String[] args) {
		List<Integer> l	=new ArrayList<Integer>();
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println("Before adding the integer Elements = "+l);
		List<Integer> l1=new ArrayList<Integer>();
		l.add(10);
		l.add(50);
		l.add(60);
		l.addAll(l1);
		System.out.println("Before  to index 3 vlaues = "+l.get(3));
		l.set(3, 70);
		//	l.set(3, "meera");// Only Integer values are allowed not string charecters
		System.out.println("After adding the integer Elements = "+l);
	}
}
