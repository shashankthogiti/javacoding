package shashank.functional.programming;

import java.util.List;

public class MethodReferencesRunner {

	public static void main(String[] args) {
		List.of("Apple", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));

		System.out.println();
		System.out.println(
				"Shortcut method for \'----forEach(s -> System.out.println(s))----\'is \'----forEach(System.out::println)\': ");
		System.out.println();
		
		List.of("Apple", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(System.out::println);

	}

}
