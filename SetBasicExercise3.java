package Set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetBasicExercise3 {// adding elements without depending on index

	public static void main(String[] args) {
		Set<String> hashset = new HashSet<>(List.of("Apple", "Bat", "Cat", "Dog", "Elephant"));
		System.out.println(hashset);
		
		hashset.remove("Dog");
		System.out.println(hashset);

		hashset.remove("Apple");
		System.out.println(hashset);

	}

}
