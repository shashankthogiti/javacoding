package Set;

import java.util.HashSet;
import java.util.Set;

public class SetBasicExercise7 {

	public static void main(String[] args) {
		Set<String> hashset = new HashSet<>();
		hashset.add("Apple");
		hashset.add("Banana");
		hashset.add("Cat");
		hashset.add("Dog");
		hashset.add("Elephant");
		System.out.println(hashset);
		
		hashset.add("Frog");
		System.out.println(hashset);

		hashset.add("Gang");
		System.out.println(hashset);

	}

}
