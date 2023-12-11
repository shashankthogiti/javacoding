package Map;

import java.util.Map;
import java.util.TreeMap;

public class mapBasicExcercise8 {

	public static void main(String[] args) {
		Map<String, Integer> treeMap = new TreeMap<>(Map.of("A", 3, "B", 5, "Z", 10));
		System.out.println(treeMap);
		// hashMap.get("A");
		System.out.println(treeMap.get("A"));

	}

}
