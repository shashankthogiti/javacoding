package shashank.functional.programming;

import java.util.List;

public class MethodReferencesRunner3 {

	public static void print(Integer number) {
		System.out.println(number);
	}

	// creating method for even
	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		List.of("Apple", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> MethodReferencesRunner3.print(s));

		System.out.println();

		List.of("Apple", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length)
				.forEach(MethodReferencesRunner3::print);
		/*
		 * creating in to method reference of .map and .forEach is ===
		 * .map(String::length).forEach(MethodReferencesRunner3::print);
		 */

		System.out.println();

		Integer maxValue = List.of(23, 45, 67, 34).stream().filter(MethodReferencesRunner3::isEven)
				.max(Integer::compare).orElse(0);
		System.out.println(maxValue);

	}
}
