package List;

import java.util.ArrayList;
import java.util.List;

public class ListBasicExercise3 {// adding elements without depending on index

	public static void main(String[] args) {
		List<String> listArrayList = new ArrayList<>(List.of("Apple", "Bat", "Cat", "Dog", "Elephant"));
		System.out.println(listArrayList);
		
		listArrayList.remove("Dog");
		System.out.println(listArrayList);

		listArrayList.remove("Apple");
		System.out.println(listArrayList);

	}

}
