package Map;

import java.util.HashMap;
import java.util.Map;

public class mapBasicExcercise3 {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>(Map.of("A", 3, "B", 5, "Z", 10));
		System.out.println(hashMap);
		hashMap.put("C", 8);
		System.out.println(hashMap);

	}

}
