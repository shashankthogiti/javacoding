package shashank.functional.programming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		
		// System.out.println("Basic method to print the list ");
		// printBasic(list);

		// System.out.println("Functional Programming method to print a list");
		// printWithFP(list);

		// System.out.println("filtered method of \'without Functional Programming\' ");
		// printBasicWithFiltering(list);

		System.out.println("Filtering in Functional Programming \' lamda method \' i.e., [->] ");
		printWithFPWithFiltering(list);
	}

	private static void printBasic(List<String> list) {
		for (String string : list) { // to print the List.of the String
			System.out.println(string);
		}
	}

	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
		}

		private static void printWithFPWithFiltering(List<String> list) {
			list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
		}
}

/*
 * System.out.println();
 * 
 * System.out.println(
 * "Syntax ===== list.stream().forEach(element -> System.out.println(element)); === it is Syntax for Functional Programming. The syntax name is \'Lamda expression\' "
 * );
 * 
 * System.out.println();
 */