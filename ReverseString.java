package string.java;

public class ReverseString {

	public static void main(String[] args) {

		String str1 = "HELLO";
		String reverse = " ";
		for (int i = str1.length() - 1; i >= 0; i--) {
			reverse += str1.charAt(i);
		}
		System.out.println(reverse);

	}

}
