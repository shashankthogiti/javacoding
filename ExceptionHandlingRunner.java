package exceptionHandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		String str = null;
		str.length();
		/* we are going to get ExceptionHandling i.e., NullPointException */
		/*
		 * The output is:-
		 * 
		 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
		 * "String.length()" because "str" is null at
		 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner.main(
		 * ExceptionHandlingRunner.java:7)
		 */

	}

}
