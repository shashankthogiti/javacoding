package shashank.functional.programming;

import java.util.List;

public class FunctionalProgrammingRunner2 {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
		
		System.out.println("Basic method to print the list ");
		printBasic(list);

		System.out.println("Functional Programming method to print a list");
		printWithFP(list);
	}

	private static void printBasic(List<String> list) {
		for (String lists : list) { // to print the List.of the String
			System.out.println(lists);
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
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