package shashank.functional.programming;

import java.util.stream.IntStream;

public class FPNumberRunnerExcercise5 { // adding the numbers from the range 1 to 11

	public static void main(String[] args) {
		IntStream.range(1, 11).reduce(0, (number1, number2) -> number1 + number2);// output is = 55
		// System.out.println(IntStream.range(1, 11).reduce(0, (number1, number2) ->
		// number1 + number2));
	}

}
//jshell>IntStream.range(1,11).reduce(0,(n1,n2)->n1+n2)
//$15==>55