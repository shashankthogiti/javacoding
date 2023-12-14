package eclipse.imports.tips.publicstaticfinal;

public class PublicStaticFinalRunner {

	public static final int SECOUNDS_IN_MINUTES = 60;
	public static final int MINUTES_IN_HOURS = 60;
	public static final int HOURS_IN_DAY = 24;
	public static final int SECOUNDS_IN_DAY = SECOUNDS_IN_MINUTES * MINUTES_IN_HOURS * HOURS_IN_DAY;

	public static void main(String[] args) {
		// System.out.println(Integer.MIN_VALUE);

		System.out.println(SECOUNDS_IN_DAY);

	}

}
