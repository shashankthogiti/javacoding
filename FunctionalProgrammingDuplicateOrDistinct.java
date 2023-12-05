package shashank.functional.programming;

import java.util.List;

public class FunctionalProgrammingDuplicateOrDistinct {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 5, 3, 213, 45, 5, 7);

		numbers.stream().distinct().forEach(element -> System.out.println(element));
	}

}
