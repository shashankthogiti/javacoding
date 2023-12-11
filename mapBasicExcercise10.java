package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class mapBasicExcercise10 {

	public static void main(String[] args) {
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>(Map.of("A", 3, "B", 5, "Z", 10));
		System.out.println(linkedHashMap);
		linkedHashMap.put("C", 8);
		System.out.println(linkedHashMap);

	}

}
