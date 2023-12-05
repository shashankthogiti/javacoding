package List;

import java.util.ArrayList;
import java.util.List;

public class ListBasicExercise8 {// adding elements without depending on index

	public static void main(String[] args) {
		List<String> listArrayList = new ArrayList<>();
		listArrayList.add("Apple");
		listArrayList.add("Banana");
		listArrayList.add("Cat");
		listArrayList.add("Dog");
		listArrayList.add("Elephant");
		System.out.println(listArrayList);
		
		listArrayList.set(1, "Hello");
		System.out.println(listArrayList);

		listArrayList.set(4, "Hi");
		System.out.println(listArrayList);

	}

}
