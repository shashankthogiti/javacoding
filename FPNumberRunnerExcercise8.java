package shashank.functional.programming;

import java.util.List;

public class FPNumberRunnerExcercise8 { // getting odd value from list

	public static void main(String[] args) {
		List.of(23, 12, 34, 53).stream().filter(e -> e % 2 == 1).forEach(e -> System.out.println(e));// output = 23,53
	}

}
//jshell>  List.of(23,12,34,53).stream().filter(e -> e%2 ==1).forEach(e -> System.out.println(e))
//$1 ==> 23,53