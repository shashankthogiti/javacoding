package Map;

import java.util.HashMap;
import java.util.Map;

public class mapBasicExcercise5 {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>(Map.of("A", 3, "B", 5, "Z", 10));
		System.out.println(hashMap);
		hashMap.remove("A", 3);
		System.out.println(hashMap);

	}

}
