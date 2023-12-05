package List;

import java.util.LinkedList;
import java.util.List;

public class ListBasicExercise11 {// adding elements without depending on index

	public static void main(String[] args) {
		List<String> listLinkedList = new LinkedList<>();
		listLinkedList.add("Apple");
		listLinkedList.add("Banana");
		listLinkedList.add("Cat");
		listLinkedList.add("Dog");
		listLinkedList.add("Elephant");
		System.out.println(listLinkedList);
		
		listLinkedList.add("Frog");
		System.out.println(listLinkedList);

		listLinkedList.add("Gang");
		System.out.println(listLinkedList);

	}

}
