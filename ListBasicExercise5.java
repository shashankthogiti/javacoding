package List;

import java.util.ArrayList;
import java.util.List;

public class ListBasicExercise5 {// adding elements without depending on index

	public static void main(String[] args) {
		List<String> listArrayList = new ArrayList<>(List.of("Apple", "Bat", "Cat"));
		System.out.println(listArrayList);
		
		listArrayList.add("Dog");
		System.out.println(listArrayList);

		listArrayList.add("Elephant");
		System.out.println(listArrayList);

	}

}
