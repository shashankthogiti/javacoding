package Set;

import java.util.Set;
import java.util.TreeSet;

public class SetBasicExercise21 {

	public static void main(String[] args) {
		Set<String> set = Set.of("Apple", "Bat", "Cat");
		System.out.println(set);/* List is immutable we can not add or remove or update values */
		Set<String> treeset = new TreeSet<>(set);
		System.out.println(treeset);

	}

}
