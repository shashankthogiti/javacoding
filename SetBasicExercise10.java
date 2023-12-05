package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetBasicExercise10 {// adding elements without depending on index

	public static void main(String[] args) {
		Set<String> setLinkedHashSet = new LinkedHashSet<>();
		setLinkedHashSet.add("Apple");
		setLinkedHashSet.add("Banana");
		setLinkedHashSet.add("Cat");
		setLinkedHashSet.add("Dog");
		setLinkedHashSet.add("Elephant");
		System.out.println(setLinkedHashSet);
		
		/*
		 * setLinkedHashSet.set(1, "Hello"); System.out.println(setLinkedHashSet);
		 * 
		 * setLinkedHashSet.set(4, "Hi"); System.out.println(setLinkedHashSet);
		 */

	}

}
