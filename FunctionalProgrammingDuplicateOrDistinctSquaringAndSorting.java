package shashank.functional.programming;

import java.util.List;

public class FunctionalProgrammingDuplicateOrDistinctSquaringAndSorting {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 5, 3, 213, 45, 5, 7);

		numbers.stream().distinct().map(element -> (element * element)).sorted()
				.forEach(element -> System.out.println(element));
	}

}
