package collection.class2.set;

import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String a[]){
		
		SortedSet<String> h1 = new TreeSet<String>();
		h1.add("Sagar");
		h1.add("Sagar2");
		h1.add("Sagar3");
		h1.add("Sagar4");
		h1.add("Sagar5");
		h1.add("Sagar6");
		h1.add("Sagar7");
		h1.add("Sagar8");
		h1.add("Sagar9");
		h1.add("Sagar10");
		System.out.println(h1);
		TreeSet<String> h2 = new TreeSet<String>(h1);
		System.out.println(h2);
		
		Stack<String> v1 = new Stack<String>();
		v1.push("Sagar5");
		v1.push("Sagar2");
		System.out.println(v1);
		TreeSet<String> h3 = new TreeSet<String>(v1);
		System.out.println(h3);
		
	}
}
