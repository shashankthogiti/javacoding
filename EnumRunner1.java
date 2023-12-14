package eclipse.imports.tips.enums;

import java.util.Arrays;

enum Seasons {
	WINTER(2), SPRING(4), SUMMER(1), FALL(3);
	
	private int value;

	private Seasons(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

public class EnumRunner1 {

	public static void main(String[] args) {
		Seasons season = Seasons.FALL;
		
		Seasons season1 = Seasons.valueOf("WINTER");
		System.out.println(season1);

		System.out.println(Seasons.SPRING.ordinal());
		System.out.println(Seasons.SPRING.getValue());

		System.out.println(Arrays.toString(Seasons.values()));
	}

}
