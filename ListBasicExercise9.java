package List;

import java.util.LinkedList;
import java.util.List;

public class ListBasicExercise9 {// adding elements without depending on index

	public static void main(String[] args) {
		List<String> lisLinkedList = new LinkedList<>();
		lisLinkedList.add("Apple");
		lisLinkedList.add("Banana");
		lisLinkedList.add("Cat");
		lisLinkedList.add("Dog");
		lisLinkedList.add("Elephant");
		System.out.println(lisLinkedList);
		
		lisLinkedList.set(1, "Hello");
		System.out.println(lisLinkedList);

		lisLinkedList.set(4, "Hi");
		System.out.println(lisLinkedList);

	}

}
