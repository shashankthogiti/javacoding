package Set;

import java.util.HashSet;
import java.util.Set;

public class SetBasicExercise2 {

	public static void main(String[] args) {
		Set<String> set = Set.of("Apple", "Bat", "Cat");
		System.out.println(set);/* List is immutable we can not add or remove or update values */
		Set<String> hashset = new HashSet<>(set);
		System.out.println(hashset);

	}

}
