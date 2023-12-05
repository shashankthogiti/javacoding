package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetBasicExercise22 {

	public static void main(String[] args) {
		Set<String> set = Set.of("Apple", "Bat", "Cat");
		System.out.println(set);/* Set is immutable we can not add or remove or update values */
		Set<String> linkedhashset = new LinkedHashSet<>(set);
		System.out.println(linkedhashset);

	}

}
