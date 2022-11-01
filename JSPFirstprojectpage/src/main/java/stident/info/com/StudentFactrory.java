package stident.info.com;

import java.util.ArrayList;
import java.util.List;

public class StudentFactrory {

	public static List<Student> getStudentList() {

		List<Student> list = new ArrayList<>();
         
		list.add(new Student("Ajay",23,"9th"));
		list.add(new Student("Mahesh",13,"7th"));
		list.add(new Student("Sunil",21,"11th"));
		list.add(new Student("sahil",24,"18th"));
		
		return list;
	}
}
