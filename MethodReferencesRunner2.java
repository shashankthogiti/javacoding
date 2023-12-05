package shashank.functional.programming;

import java.util.List;

public class MethodReferencesRunner2 {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		List.of("Apple", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> MethodReferencesRunner2.print(s));
		/*
		 * Accessing method from----- public static void print(Integer number) {
		 * System.out.println(number); }
		 */

		System.out.println("\n\t  or  \t\n");

		
		List.of("Apple", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(MethodReferencesRunner2::print);

	}

}
