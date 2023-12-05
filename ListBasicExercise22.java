package List;

import java.util.List;
import java.util.Vector;

public class ListBasicExercise22 {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat");
		System.out.println(list);/* List is immutable we can not add or remove or update values */
		List<String> listVector = new Vector<>(list);
		System.out.println(listVector);

	}

}
