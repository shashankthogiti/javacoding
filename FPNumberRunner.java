package shashank.functional.programming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

		System.out.println("printing output using Functional Programming method");
		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);// here 0 is sum because we don't
																						// know about the sum value so
																						// let the initilized sum is 0
																						// the starting
																						// value
																						// number1, number2 is addition
																						// of two number
		System.out.println(sum);
	}

}
