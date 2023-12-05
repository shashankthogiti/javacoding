package shashank.functional.programming;

import java.util.List;

public class FunctionalProgrammingExercise2 {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 4, 7, 9);

		printFPOddNumber(list); // FP stands for Functional Programming
	}

	private static void printFPOddNumber(List<Integer> list) {
		list.stream().filter(element -> element % 2 == 1).forEach(number -> System.out.println(number));
		/* printing odd number using filter method */
	}

}
