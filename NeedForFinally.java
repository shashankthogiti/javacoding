package exceptionHandling;

import java.util.Scanner;

public class NeedForFinally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numbers = { 12, 3, 4, 5 };
		int number = numbers[5];

		sc.close();
	}

}
/*
 * output:-
 * 
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
 * out of bounds for length 4 at
 * exceptionHandeling/exceptionHandling.NeedForFinally.main(NeedForFinally.java:
 * 11)
 * 
 */