package collection.class2.synchronizedList;

import java.util.Iterator;
import java.util.Stack;

public class StackAPIDemo {
	public static void main(String a[]){
		Stack<String> v1 = new Stack<String>();
		v1.push("Sagar");
		v1.push("Sagar2");
		v1.pop();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1);
		v1.push("Sagar2");
		v1.push("Sagar3");
		v1.push("Sagar4");
		v1.push("Sagar5");
		v1.push("Sagar2");
		v1.peek();
		v1.search("sagar6");
		v1.search("Sagar2");
		System.out.println(v1);
		System.out.println(v1.elementAt(3));
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		
		Iterator<String> itr = v1.iterator();
		while(itr.hasNext()){
			String s = itr.next();
			System.out.println(s);
		}
		itr = null;
		itr = v1.iterator();
		while(itr.hasNext()){
			String s = itr.next();
			if(s == "Sagar5"){
				itr.remove();
			}else{				
				System.out.println(s);
			}
		}
		
		System.out.println(v1);
		
		v1.removeAllElements();
		System.out.println(v1.isEmpty());
				
	}
}
