package string.java;

import java.util.Scanner;

public class VowelString {

	public static void main(String[] args) {
		System.out.println("Enter a word");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		str1 = str1.toLowerCase();
		System.out.println(str1);
		int vowel = 0;
		for(int i = 0 ; i <= str1.length()-1 ; i++) {
			char ch = str1.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			}
		}
		System.out.println("The number of vowels in String are: " + vowel);

	}

}
