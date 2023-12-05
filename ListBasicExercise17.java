package List;

import java.util.LinkedList;
import java.util.List;

public class ListBasicExercise17 {// adding elements with depending on index

	public static void main(String[] args) {
		List<String> listLinkedList = new LinkedList<>(List.of("Apple", "Bat", "Cat"));
		System.out.println(listLinkedList);
		
		listLinkedList.add(2, "Dog");
		System.out.println(listLinkedList);

		listLinkedList.add(0, "Elephant");
		System.out.println(listLinkedList);

	}

}
