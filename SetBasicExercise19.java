package Set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetBasicExercise19 {// adding elements without depending on index

	public static void main(String[] args) {
		Set<String> treeset = new TreeSet<>(List.of("Apple", "Bat", "Cat", "Dog", "Elephant"));
		System.out.println(treeset);
		
		treeset.remove("Dog");
		System.out.println(treeset);

		treeset.remove("Apple");
		System.out.println(treeset);

	}

}
