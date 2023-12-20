package api.c;

// Predicate.not method is introduced in java 11

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		List<Integer> number = List.of(3, 4, 5, 67, 89, 88);
		// Predicate<Integer> evenNumberPredicate = numbers -> numbers % 2 == 0;
		// number.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);
		number.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
	}

}
