package exceptionHandling;

import java.util.Scanner;

public class NeedForFinally1 {

	public static void main(String[] args) {

		try {
		Scanner sc = new Scanner(System.in);

		int[] numbers = { 12, 3, 4, 5 };
		int number = numbers[5];
		System.out.println("Before scanner close");
		sc.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("Just before closeing out main");
	}

}
