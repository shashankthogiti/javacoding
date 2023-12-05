package List;

import java.util.ArrayList;
import java.util.List;

public class ListBasicExercise2 {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat");
		System.out.println(list);/* List is immutable we can not add or remove or update values */
		List<String> listArrayList = new ArrayList<>(list);
		System.out.println(listArrayList);

	}

}
