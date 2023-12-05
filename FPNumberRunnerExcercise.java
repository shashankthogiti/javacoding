package shashank.functional.programming;

import java.util.stream.IntStream;

public class FPNumberRunnerExcercise { // print square of first 10 numbers

	public static void main(String[] args) {
		/*
		 * to print first 10 number of square we need to take the range from 1 to 11 ,
		 * here we take 1 to 11 rather than 1 to 10 because if we take 1 to 10 we get
		 * the square up-to 9 number only
		 */
		IntStream.range(1, 11).map(num -> num * num).forEach(num -> System.out.println(num));

	}

}
