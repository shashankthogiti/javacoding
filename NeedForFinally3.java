package exceptionHandling;

import java.util.Scanner;

public class NeedForFinally3 {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);

		int[] numbers = { 12, 3, 4, 5 };
		int number = numbers[2];// value for 2 the output is
		sc.close();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		System.out.println("Before scanner close");
		sc.close();
	}
	System.out.println("Just before closeing out main");
	}

}
/*
 * output
 * 
 * 
 * Before scanner close
 * 
 * 
 * Just before closeing out main
 */
