package collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ranga"), new Student(100, "Adam"), new Student(2, "Eve"));
		System.out.println(students);
		/*
		 * for changing the students List we need to create an ArrayList so that we can
		 * add or remove or re-arrange[Asecnding or Decending order] it.
		 */
		List<Student> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl);

		Collections.sort(studentsAl);
		System.out.println(studentsAl + "is Desc");

		/*
		 * Collections.sort(studentsAl, new AscendingStudentComparator());
		 * System.out.println(studentsAl + "is AscendingStudentComparator");
		 */

		studentsAl.sort(new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator" + studentsAl);
	}

}
