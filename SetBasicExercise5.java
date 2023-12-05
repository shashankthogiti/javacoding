package Set;

import java.util.HashSet;
import java.util.Set;

public class SetBasicExercise5 {

	public static void main(String[] args) {
		Set<String> hashset = new HashSet<>(Set.of("Apple", "Bat", "Cat"));
		System.out.println(hashset);
		
		hashset.add("Dog");
		System.out.println(hashset);

		hashset.add("Elephant");
		System.out.println(hashset);

	}

}
