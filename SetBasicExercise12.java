package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetBasicExercise12 {// adding elements without depending on index

	public static void main(String[] args) {
		Set<String> linkedhashset = new LinkedHashSet<>();
		linkedhashset.add("Apple");
		linkedhashset.add("Banana");
		linkedhashset.add("Cat");
		linkedhashset.add("Dog");
		linkedhashset.add("Elephant");
		System.out.println(linkedhashset);
		
		linkedhashset.add("Frog");
		System.out.println(linkedhashset);

		linkedhashset.add("Gang");
		System.out.println(linkedhashset);

	}

}
