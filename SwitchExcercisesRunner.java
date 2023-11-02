public class SwitchExcercisesRunner {

	public static void main(String[] args) {
		System.out.println(determineNameOfMonth(1));		//number can be 1,2,3,....,11,12
	}

	public static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "January";

		case 2:
			return "Febuary";

		case 3:
			return "March";

		case 4:
			return "April";

		case 5:
			return "May";

		case 6:
			return "June";

		case 7:
			return "July";

		case 8:
			return "August";

		case 9:
			return "September";

		case 10:
			return "October";

		case 11:
			return "November";

		case 12:
			return "December";
		}
		return "invalid";
	}
}
