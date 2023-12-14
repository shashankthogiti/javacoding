package exceptionHandling;

//introduction of try-catch block

public class ExceptionHandlingRunner5 {

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
		String str = null;
		str.length();
		System.out.println("Method2 Ended");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

/*
 * The output is:-
 * 
 * java.lang.NullPointerException: Cannot invoke "String.length()" because "str"
 * is null at
 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner5.method2(
 * ExceptionHandlingRunner5.java:18) at
 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner5.method1(
 * ExceptionHandlingRunner5.java:11) at
 * exceptionHandeling/exceptionHandling.ExceptionHandlingRunner5.main(
 * ExceptionHandlingRunner5.java:6)
 * 
 * 
 * Method1 Ended
 * 
 * 
 * Main Method
 */