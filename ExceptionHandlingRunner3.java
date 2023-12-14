package exceptionHandling;

public class ExceptionHandlingRunner3 {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Method");
	}

	private static void method1() {
		method2();
		System.out.println("Method1 Ended");
	}

	private static void method2() {
		String str = null;
		str.length();
		System.out.println("Method2 Ended");
	}

}
/*
 * here we are going to get an exception because we are call method1 for output
 * but we get an exception we included method2 in method1 so it don't know what
 * to do with the exception so it again throws an exception
 * 
 * 
 * the output of the code is:-
 * 
 * 
 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
 * "String.length()" because "str" is null at
 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner3.method2(
 * ExceptionHandlingRunner3.java:17) at
 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner3.method1(
 * ExceptionHandlingRunner3.java:11) at
 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner3.main(
 * ExceptionHandlingRunner3.java:6)
 * 
 */
