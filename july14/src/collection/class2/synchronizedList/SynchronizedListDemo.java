package collection.class2.synchronizedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SynchronizedListDemo {
	
	public static void main(String a[]){
		List<String> students = new ArrayList<String>();
		students.add("Ritesh");
		students.add("Shubham");
		
		List synchronizedStudents = students.synchronizedList(students);

	}

}
