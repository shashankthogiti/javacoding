package exceptionHandling;

public class ExceptionHandlingRunner4 {

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
	} catch (NullPointerException ex) {
		System.out.println("NullPointException");
		ex.printStackTrace();
	}catch (Exception ex) {
		ex.printStackTrace();
	}
		}
}
