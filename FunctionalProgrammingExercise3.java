package shashank.functional.programming;

import java.util.List;

public class FunctionalProgrammingExercise3 {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 4, 7, 9);

		printFPEvenNumber(list); // FP stands for Functional Programming
	}

	private static void printFPEvenNumber(List<Integer> list) {
		list.stream().filter(element -> element % 2 == 0).forEach(number -> System.out.println(number));
		/* printing even number using filter method */
	}

}
