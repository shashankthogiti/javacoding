package exceptionHandling;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {

		method1();
	}

	private static void method1() {
		String str = null;
		str.length();
		/*
		 * we have refactored and extracted the above method for 1 time i.e.,
		 * 
		 * String str = null;
		 * 
		 * str.length();
		 */

		/*
		 * the output is:-
		 * 
		 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
		 * "String.length()" because "str" is null at
		 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner2.method1(
		 * ExceptionHandlingRunner2.java:12) at
		 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner2.main(
		 * ExceptionHandlingRunner2.java:7)
		 */
	}

}
