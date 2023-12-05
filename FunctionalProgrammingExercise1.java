package shashank.functional.programming;

import java.util.List;

public class FunctionalProgrammingExercise1 {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 4, 7, 9);

		printFP(list); // FP stands for Functional Programming
	}

	private static void printFP(List<Integer> list) {
		list.stream().forEach(number -> System.out.println(number));
	}

}
