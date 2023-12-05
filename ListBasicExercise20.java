package List;

import java.util.List;
import java.util.Vector;

public class ListBasicExercise20 {// adding elements without depending on index

	public static void main(String[] args) {
		List<String> listVector = new Vector<>(List.of("Apple", "Bat", "Cat", "Dog", "Elephant"));
		System.out.println(listVector);
		
		listVector.remove("Dog");
		System.out.println(listVector);

		listVector.remove("Apple");
		System.out.println(listVector);

	}

}
