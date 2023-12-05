package shashank.functional.programming;

import java.util.List;

public class FPNumberRunner2 {

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
		
		
		System.out.println("Normal method of adding numbers");
		int addition = 0;
		for(Integer number: numbers) {
			addition += number;
		}
		System.out.println(addition);
	}

}
