package List;

import java.util.ArrayList;
import java.util.List;

public class ListBasicExercise4 {// adding elements with depending on index

	public static void main(String[] args) {
		List<String> listArrayList = new ArrayList<>(List.of("Apple", "Bat", "Cat"));
		System.out.println(listArrayList);
		
		listArrayList.add(2, "Dog");
		System.out.println(listArrayList);

		listArrayList.add(0, "Elephant");
		System.out.println(listArrayList);

	}

}
