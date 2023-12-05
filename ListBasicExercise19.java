package List;

import java.util.LinkedList;
import java.util.List;

public class ListBasicExercise19 {// adding elements without depending on index

	public static void main(String[] args) {
		List<String> listLinkedList = new LinkedList<>(List.of("Apple", "Bat", "Cat", "Dog", "Elephant"));
		System.out.println(listLinkedList);
		
		listLinkedList.remove("Dog");
		System.out.println(listLinkedList);

		listLinkedList.remove("Apple");
		System.out.println(listLinkedList);

	}

}
