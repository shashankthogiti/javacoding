package shashank.functional.programming;


import java.util.List;

public class FPNumberRunner3 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

		System.out.println("printing odd number as output using Functional Programming method");
		int sum = numbers.stream().filter(number -> number % 2 == 1).reduce(0, (number1, number2) -> number1 + number2);
		/*
		 * streaming numbers filtering odd number then we are adding them
		 */
		System.out.println(sum);
	}

}
