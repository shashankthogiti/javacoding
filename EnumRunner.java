package eclipse.imports.tips.enums;

import java.util.Arrays;

enum Season {
	WINTER, SPRING, SUMMER, FALL;
}

public class EnumRunner {

	public static void main(String[] args) {
		Season season = Season.FALL;
		
		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);

		System.out.println(Season.SPRING.ordinal());

		System.out.println(Arrays.toString(Season.values()));
	}

}
