package List;

import java.util.LinkedList;
import java.util.List;

public class ListBasicExercise21 {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat");
		System.out.println(list);/* List is immutable we can not add or remove or update values */
		List<String> listLinkedList = new LinkedList<>(list);
		System.out.println(listLinkedList);

	}

}
