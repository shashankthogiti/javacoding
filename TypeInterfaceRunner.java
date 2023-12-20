package api.e;

import java.util.List;

//java 10 introduced Type Interface  method 

public class TypeInterfaceRunner {

	public static void main(String[] args) {
		List<String> name1 = List.of("Ranga", "Ravi");
		List<String> name2 = List.of("John", "Adam");

		List<List<String>> name = List.of(name1, name2);
		name.stream().forEach(System.out::println);// Here List<List<String>> is looking more complex so it introduced
													// var method
		
		System.out.println();
		
		var names = List.of(name1, name2);
		names.stream().forEach(System.out::println);// Here List<List<String>> is looking more complex so it introduced
													// var method
		
		for (var allNames : name1) {
			System.out.println(allNames);// we used var insted of String in loops
		}

	}

}
