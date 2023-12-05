package List;

import java.util.List;
import java.util.Vector;

public class ListBasicExercise10 {// adding elements without depending on index

	public static void main(String[] args) {
		List<String> listVector = new Vector<>();
		listVector.add("Apple");
		listVector.add("Banana");
		listVector.add("Cat");
		listVector.add("Dog");
		listVector.add("Elephant");
		System.out.println(listVector);
		
		listVector.set(1, "Hello");
		System.out.println(listVector);

		listVector.set(4, "Hi");
		System.out.println(listVector);

	}

}
