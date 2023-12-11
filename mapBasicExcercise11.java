package Map;

import java.util.Map;
import java.util.TreeMap;

public class mapBasicExcercise11 {

	public static void main(String[] args) {
		Map<String, Integer> treeMap = new TreeMap<>(Map.of("A", 3, "B", 5, "Z", 10));
		System.out.println(treeMap);
		treeMap.put("C", 8);
		System.out.println(treeMap);

	}

}
