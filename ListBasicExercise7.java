package List;

import java.util.ArrayList;
import java.util.List;

public class ListBasicExercise7 {// adding elements without depending on index

	public static void main(String[] args) {
		List<String> listArrayList = new ArrayList<>();
		listArrayList.add("Apple");
		listArrayList.add("Banana");
		listArrayList.add("Cat");
		listArrayList.add("Dog");
		listArrayList.add("Elephant");
		System.out.println(listArrayList);
		
		listArrayList.add("Frog");
		System.out.println(listArrayList);

		listArrayList.add("Gang");
		System.out.println(listArrayList);

	}

}
