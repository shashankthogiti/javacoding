package shashank.functional.programming;

import java.util.List;
import java.util.stream.Collectors;

public class FPNumberRunnerExcercise11 { // getting even value from list in list format

	public static void main(String[] args) {
		List.of(23, 12, 34, 53).stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		// System.out.println(List.of(23, 12, 34, 53).stream().filter(e -> e % 2 ==
		// 0).collect(Collectors.toList()));
	}

}
//jshell>   List.of(23,12,34,53).stream().filter(e -> e%2 ==0).collect(Collectors.toList())
//$1 ==>   [12, 34]