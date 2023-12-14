package exceptionHandling;

import java.util.Scanner;

public class NeedForFinally2 {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);

		int[] numbers = { 12, 3, 4, 5 };
		int number = numbers[5];// value for 5 the output is
		sc.close();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		System.out.println("Before scanner close");
		if (sc != null) {
			sc.close();
		}
	}
	System.out.println("Just before closeing out main");
	}

}
/*
 * output
 * 
 * java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
 * at exceptionHandeling/exceptionHandling.NeedForFinally2.main(NeedForFinally2.
 * java:13)
 * 
 * 
 * Before scanner close
 * 
 * 
 * Just before closeing out main
 */
