package shashank.functional.programming;

import java.util.List;

public class FPNumberRunnerExcercise3 { // print upper case for {List.of("Apple","Ant","Bat").stream()}

	public static void main(String[] args) {
		List.of("Apple", "Ant", "Bat").stream().map(s -> s.toUpperCase()).forEach(p -> System.out.println(p));
	}

}
