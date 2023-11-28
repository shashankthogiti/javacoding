package collection.setMethod;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		System.out.println(characters);

		Set<Character> treeSet = new TreeSet(characters);
		System.out.println(treeSet);

		Set<Character> linkedHashSet = new LinkedHashSet(characters);
		System.out.println(linkedHashSet);
		Set<Character> hashSet = new HashSet(characters);
		System.out.println(hashSet);
	}

}
/*
 * unique - Set , TreeSet , HashSet , LinkedHashSet
 */
