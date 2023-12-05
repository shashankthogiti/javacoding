package shashank.functional.programming;

import java.util.List;

public class FPNumberRunnerExcercise7 { // getting minimum value from list

	public static void main(String[] args) {
		List.of(23, 12, 34, 53).stream().min((n1, n2) -> Integer.compare(n1, n2)).get();// output is = 12
		/*
		 * System.out.println(List.of(23, 12, 34, 53).stream().min((n1, n2) ->
		 * Integer.compare(n1, n2)).get());
		 */
	}

}
//jshell> List.of(23,12,34,53).stream().min((n1,n2) -> Integer.compare(n1,n2)).get()
//$1 ==> 12