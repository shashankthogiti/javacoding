package exceptionHandling;

public class ExceptionHandlingRunner7 {

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
	} catch (ArrayIndexOutOfBoundsException ex) {
		System.out.println("Matched ArrayIndexOutOfBoundsException");
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
 * Matched ArrayIndexOutOfBoundsException
 * 
 * 
 * java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
 * 
 * 
 * at exceptionHandeling/exceptionHandling.ExceptionHandlingRunner7.method2(
 * ExceptionHandlingRunner7.java:20) at
 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner7.method1(
 * ExceptionHandlingRunner7.java:11) at
 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner7.main(
 * ExceptionHandlingRunner7.java:6)
 * 
 * 
 * Method1 Ended
 * 
 * 
 * Main Method
 */
