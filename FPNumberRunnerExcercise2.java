package shashank.functional.programming;

import java.util.List;

public class FPNumberRunnerExcercise2 { // print lower case for {List.of("Apple","Ant","Bat").stream()}

	public static void main(String[] args) {
		List.of("Apple", "Ant", "Bat").stream().map(s -> s.toLowerCase()).forEach(p -> System.out.println(p));
	}

}
