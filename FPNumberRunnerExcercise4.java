package shashank.functional.programming;

import java.util.List;

public class FPNumberRunnerExcercise4 { // print length for {List.of("Apple","Ant","Bat").stream()}

	public static void main(String[] args) {
		List.of("Apple", "Ant", "Bat").stream().map(s -> s.length()).forEach(p -> System.out.println(p));
	}

}
