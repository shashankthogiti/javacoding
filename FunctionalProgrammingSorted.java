package shashank.functional.programming;

import java.util.List;

public class FunctionalProgrammingSorted {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 5, 8, 213, 45, 4, 7);

		numbers.stream().sorted().forEach(element -> System.out.println(element));
	}

}
