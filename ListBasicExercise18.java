package List;

import java.util.List;
import java.util.Vector;

public class ListBasicExercise18 {// adding elements with depending on index

	public static void main(String[] args) {
		List<String> listVector = new Vector<>(List.of("Apple", "Bat", "Cat"));
		System.out.println(listVector);
		
		listVector.add(2, "Dog");
		System.out.println(listVector);

		listVector.add(0, "Elephant");
		System.out.println(listVector);

	}

}
