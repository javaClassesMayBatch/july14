package collection.class2.set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String a[]){
		HashSet<String> h1 = new HashSet<String>(4,0.5f);
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
	}
}
