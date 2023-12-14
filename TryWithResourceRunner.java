package exceptionHandling;

import java.util.Scanner;

public class TryWithResourceRunner {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[21];
		} // catch and finally is not mandatory
	}

}
/*
 * output:-
 * 
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 21
 * out of bounds for length 4
 * 
 * 
 * at exceptionHandeling/exceptionHandling.TryWithResourceRunner.main(
 * TryWithResourceRunner.java:10)
 * 
 * 
 * 
 * 
 */