package List;

import java.util.List;

public class ListBasicExercise {

	public static void main(String[] args) {
		List list = List.of("Apple", 'A', 1, 1.0);
		System.out.println(list);
		/*
		 * here the List is taking String , Character ,Integer , Double value without
		 * getting an error because we didn't mention what kind of wrapper class we need
		 * to take or what kind of string we need to take for a specific class
		 */
	}

}
