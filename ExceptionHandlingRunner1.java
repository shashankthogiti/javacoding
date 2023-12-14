package exceptionHandling;

public class ExceptionHandlingRunner1 {

	public static void main(String[] args) {

		method1();
	}

	private static void method1() {
		method2();
	}

	private static void method2() {
		String str = null;
		str.length();
		/*
		 * we have refactored and extracted the above method for 2 time i.e.,
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
		 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner1.method(
		 * ExceptionHandlingRunner1.java:14) at
		 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner1.main(
		 * ExceptionHandlingRunner1.java:7)
		 * 
		 */
	}

}
