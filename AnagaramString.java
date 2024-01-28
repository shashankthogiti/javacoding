package string.java;

import java.util.Arrays;
import java.util.Scanner;

public class AnagaramString {

	public static void main(String[] args) {
		System.out.println("Enter any word that is equal to Anagaram");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		str1 = str1.toLowerCase(); // converting upper to lower cases
		str2 = str2.toLowerCase();
		char ch1[] = str1.toCharArray();	//charArray method
		char ch2[] = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean result = Arrays.equals(ch1, ch2);
		if (result == true) {
			System.out.println("It is an Anagaram");
		} else {
			System.out.println("Not an Anagaram");
		}
	}

}
//OUTPUT - type 'LISTEN , SILENT'
/*
 * first we need to take an input of a string [str1] and convert it in to
 * character array using "charArray" method and we need to sort the character
 * array using "Arrays.sort" method and we need to same method or same for
 * another string [str2] at last we use .equals [Arrays.equals] method to find
 * weather it is true or false
 */