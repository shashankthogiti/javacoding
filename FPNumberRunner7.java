package shashank.functional.programming;

import java.util.List;

public class FPNumberRunner7 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

		/*
		 * System.out.println("printing output using Functional Programming method");
		 * int sum = numbers.stream().reduce(0, (number1, number2) -> number1 +
		 * number2);// here 0 is sum because we don't // know about the sum value so //
		 * let the initilized sum is 0 // the starting // value // number1, number2 is
		 * addition // of two number System.out.println(sum); //
		 * System.out.println("Normal method using extract method to adding numbers");
		 */
		
		
		int sum = fpSum(numbers);
		System.out.println("Noraml sum is:" + sum);
		int sum1 = normalSum(numbers);
		System.out.println("FP sum is:" + sum1);
	}

	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number; // mutations
		}
		return sum;
	}


}

/*
 * we can write the above code as- private static void normalSum(List<Integer>
 * numbers) { int sum = 0; for (int number : numbers) { sum += number; //
 * mutations } System.out.println(sum);// sum; }
 */