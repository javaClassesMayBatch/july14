package collection.class2.synchronizedList;

import java.util.Enumeration;
import java.util.Vector;

public class VectorAPIDemo {
	
	public static void main(String a[]){
		Vector<String> v1 = new Vector<String>();
		v1.addElement("Sagar");
		v1.add("Sagar2");
		v1.removeElement("Sagar2");
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1);
		v1.add("Sagar2");
		v1.add("Sagar31");
		v1.add("Sagar4");
		v1.add("Sagar51");
		v1.addElement("Sgr234");
		v1.removeElementAt(3);
		System.out.println(v1);
		System.out.println(v1.elementAt(3));
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		Enumeration<String> e1 = v1.elements();
		while(e1.hasMoreElements()){
			String s = e1.nextElement();
			if(s.length() <= 6)
				System.out.println(s);
		}
		v1.removeAllElements();
		System.out.println(v1.isEmpty());
		
				
	}

}
