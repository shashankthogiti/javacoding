package shashank.functional.programming;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumberRunnerExcercise12 { // getting square value from range of 1 to 11 in list format

	public static void main(String[] args) {
		IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList()); // boxed() is key word to convert
																						// in to List
		// System.out.println(IntStream.range(1,11).map(e ->
		// e*e).boxed().collect(Collectors.toList()));
	}

}
//jshell>   IntStream.range(1,11).map(e -> e*e).boxed().collect(Collectors.toList())
//$7 ==> [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]