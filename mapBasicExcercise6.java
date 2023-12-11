package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class mapBasicExcercise6 {

	public static void main(String[] args) {
		Map<String, Integer> linkedHashashMap = new LinkedHashMap<>(Map.of("A", 3, "B", 5, "Z", 10));
		System.out.println(linkedHashashMap);
		linkedHashashMap.remove("A", 3);
		System.out.println(linkedHashashMap);

	}

}
