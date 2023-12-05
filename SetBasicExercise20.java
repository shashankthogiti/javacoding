package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetBasicExercise20 {// adding elements without depending on index

	public static void main(String[] args) {
		Set<String> linkedhashset = new LinkedHashSet<>(Set.of("Apple", "Bat", "Cat", "Dog", "Elephant"));
		System.out.println(linkedhashset);
		
		linkedhashset.remove("Dog");
		System.out.println(linkedhashset);

		linkedhashset.remove("Apple");
		System.out.println(linkedhashset);

	}

}
