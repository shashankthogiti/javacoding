public class SwitchExcercises {

	public static void main(String[] args) {
		System.out.println(determineNameOfDay(0));		//number can be 0,1,2,3,...6
	}

	public static String determineNameOfDay(int dayNumber) {
		String result = "";
		switch(dayNumber) {
		case 0: 
			result = "Monday";
			break;
		case 1:
			result = "Tuesday";
			break;
		case 2:
			result = "Wednesday";
			break;
		case 3:
			result = "Thursday";
			break;
		case 4:
			result = "Friday";
			break;
		case 5:
			result = "Saturday";
			break;
		case 6:
			result = "Sunday";
			break;
		}
		return result;
	}
}
