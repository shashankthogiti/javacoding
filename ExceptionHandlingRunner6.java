package exceptionHandling;

public class ExceptionHandlingRunner6 {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Method");
	}

	private static void method1() {
		method2();
		System.out.println("Method1 Ended");
	}

	private static void method2() {
		try {
			// String str = null;
			// str.length();
			int[] i = { 1, 2 };
			int number = i[3];
		System.out.println("Method2 Ended");
	} catch (NullPointerException ex) {
		System.out.println("Matched NullPointException");
		ex.printStackTrace();
	} catch (Exception ex) {
		System.out.println("Matched Exception");
		ex.printStackTrace();
	}
		}
}

/*
 * output is:-
 * 
 * Matched Exception
 * 
 * 
 * java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
 * at exceptionHandeling/exceptionHandling.ExceptionHandlingRunner6.method2(
 * ExceptionHandlingRunner6.java:20) at
 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner6.method1(
 * ExceptionHandlingRunner6.java:11) at
 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner6.main(
 * ExceptionHandlingRunner6.java:6)
 * 
 * 
 * Method1 Ended
 * 
 * 
 * Main Method
 */
